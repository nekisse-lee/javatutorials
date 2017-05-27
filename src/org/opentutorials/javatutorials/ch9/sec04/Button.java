package org.opentutorials.javatutorials.ch9.sec04;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

    interface  OnClickListener{
        void  onClick();
    }
}
