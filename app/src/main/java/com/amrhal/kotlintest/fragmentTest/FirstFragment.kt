package com.amrhal.kotlintest.fragmentTest

import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amrhal.kotlintest.R
import com.bumptech.glide.request.target.BitmapImageViewTarget
import kotlinx.android.synthetic.main.frag.*

class FirstFragment : Fragment() {

    companion object {
        fun newInstance():FirstFragment{
            return FirstFragment()
        }
    }


    private val imageUrl = "https://static.pexels.com/photos/596940/pexels-photo-596940.jpeg"

    fun loadImage(){
        //during downloading we will see prograssbar and after finish prograssbar will become invisible

        progressBar.visibility = View.VISIBLE
        GlideApp.with(activity!!).asBitmap()
            .load(Uri.parse(imageUrl))
            .into(object: BitmapImageViewTarget(firstFragmentImageView){
                override fun onResourceReady(
                    resource: Bitmap,
                    transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?
                ) {
                    super.onResourceReady(resource, transition)
                progressBar.visibility = View.INVISIBLE
                }
            })
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.frag,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        loadImage()
    }
}