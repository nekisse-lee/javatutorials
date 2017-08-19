package javatutorials.ch9.sec05.exam03_button_event;

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
