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
import kotlinx.android.synthetic.main.frag1.*
import kotlinx.android.synthetic.main.frag2.*

class SecondFragment : Fragment() {

    companion object {
        fun newInstance():SecondFragment{
            return SecondFragment()
        }
    }


    private val imageUrl = "https://images.pexels.com/photos/163065/mobile-phone-android-apps-phone-163065.jpeg"

    fun loadImage(){
        //during downloading, we will see the progress bar and after it finished progress bar will become invisible

        progressBar2.visibility = View.VISIBLE
        GlideApp.with(activity!!).asBitmap()
            .load(Uri.parse(imageUrl))
            .into(object: BitmapImageViewTarget(secondFragmentImageView){
                override fun onResourceReady( // when the is ready 
                    resource: Bitmap,
                    transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?
                ) {
                    super.onResourceReady(resource, transition)
                progressBar2.visibility = View.INVISIBLE
                }
            })
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag2,container,false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        loadImage()
    }
}