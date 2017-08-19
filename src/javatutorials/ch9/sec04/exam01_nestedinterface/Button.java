package javatutorials.ch9.sec04.exam01_nestedinterface;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

    interface OnClickListener{
        void onClick();
    }
}
