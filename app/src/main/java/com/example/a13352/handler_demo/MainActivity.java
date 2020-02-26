package com.example.a13352.handler_demo;

import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    public RadioButton slow;
    public RadioButton middle;
    public RadioButton fast;
    public int time;//设置间隔时间变量
    public Button start_button;
    public Button end_button;
    public Button Button_start_chi;
    public TextView txt_show;
    public EditText content1;
    public EditText content2;
    public EditText content3;
    public EditText content4;
    public EditText content5;
    public EditText content6;
    public EditText content7;
    public EditText content8;
    public EditText content9;
    public EditText content10;
    public EditText content11;
    public EditText content12;
    public EditText content13;
    public EditText content14;
    public EditText content15;
    public EditText content16;
    public EditText content17;
    public EditText content18;
    public EditText content19;
    public EditText content20;
    public TextToSpeech tts;
    public String tag;
    ArrayList<String> arrayList=new ArrayList<String>();
    public int length;
    public int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tag=".MainActivity";
        tts=new TextToSpeech(this,this);
        start_button=(Button)findViewById(R.id.startbutton);
        start_button.setOnClickListener(new startButtonListener());
        Button_start_chi=(Button)findViewById(R.id.Button_start_chi);
        Button_start_chi.setOnClickListener(new Button_start_chi());
        end_button=(Button)findViewById(R.id.endbutton);
        end_button.setOnClickListener(new endButtonListener());
        slow=(RadioButton)findViewById(R.id.slow);

//
//        slow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked==true){
//                    isChecked=false;
//                }
//                time=15000;
//                isChecked=true;
//            }
//        });
//        middle=(RadioButton)findViewById(R.id.middle);
//        middle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked==true){
//                    isChecked=false;
//                }
//                time=10000;
//                isChecked=true;
//            }
//        });
//        fast=(RadioButton)findViewById(R.id.fast);
//        fast.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked==true){
//                    isChecked=false;
//                }
//                time=5000;
//                isChecked=true;
//            }
//        });
//        txt_show=(TextView)findViewById(R.id.txt_show);
        content1= (EditText) findViewById(R.id.content1);
        content2=(EditText)findViewById(R.id.content2);
        content3=(EditText)findViewById(R.id.content3);
        content4=(EditText)findViewById(R.id.content4);
        content5=(EditText)findViewById(R.id.content5);
        content6=(EditText)findViewById(R.id.content6);
        content7=(EditText)findViewById(R.id.content7) ;
        content8=(EditText)findViewById(R.id.content8);
        content9=(EditText)findViewById(R.id.content9);
        content10=(EditText)findViewById(R.id.content10);
        content11=(EditText)findViewById(R.id.content11);
        content12=(EditText)findViewById(R.id.content12);
        content13=(EditText)findViewById(R.id.content13);
        content14=(EditText)findViewById(R.id.content14);
        content15=(EditText)findViewById(R.id.content15);
        content16=(EditText)findViewById(R.id.content16);
        content17=(EditText)findViewById(R.id.content17) ;
        content18=(EditText)findViewById(R.id.content18);
        content19=(EditText)findViewById(R.id.content19);
        content20=(EditText)findViewById(R.id.content20);
    }
    Handler handler=new Handler();

    @Override
    public void onInit(int status) {
        if(status==tts.SUCCESS){
            int result1=tts.setLanguage(Locale.US);
            if(result1==TextToSpeech.LANG_MISSING_DATA||result1==TextToSpeech.LANG_NOT_SUPPORTED){
                Toast.makeText(this,"数据丢失或不支持:"+result1+";",Toast.LENGTH_SHORT);
            }
        }
    }

    class startButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //设置音量，值越大声音越尖（女生），值越小变为男生，1.0常规
            tts.setPitch(1.0f);
            //设置语速
            tts.setSpeechRate(0.7f);
            if(content1.getText().length()>0) {
                arrayList.add(content1.getText().toString());
            }
            if(content2.getText().length()>0) {
                arrayList.add(content2.getText().toString());
            }
            if(content3.getText().length()>0) {
                arrayList.add(content3.getText().toString());
            }
            if(content4.getText().length()>0) {
                arrayList.add(content4.getText().toString());
            }
            if(content5.getText().length()>0) {
                arrayList.add(content5.getText().toString());
            }
            if(content6.getText().length()>0) {
                arrayList.add(content6.getText().toString());
            }
            if(content7.getText().length()>0) {
                arrayList.add(content7.getText().toString());
            }
            if(content8.getText().length()>0) {
                arrayList.add(content8.getText().toString());
            }
            if(content9.getText().length()>0) {
                arrayList.add(content9.getText().toString());
            }
            if(content10.getText().length()>0) {
                arrayList.add(content10.getText().toString());
            }
            if(content11.getText().length()>0) {
                arrayList.add(content11.getText().toString());
            }
            if (content12.getText().length()>0) {
                arrayList.add(content12.getText().toString());
            }
            if(content13.getText().length()>0) {
                arrayList.add(content13.getText().toString());
            }
            if(content14.getText().length()>0) {
                arrayList.add(content14.getText().toString());
            }
            if(content15.getText().length()>0) {
                arrayList.add(content15.getText().toString());
            }
            if(content16.getText().length()>0) {
                arrayList.add(content16.getText().toString());
            }
            if(content17.getText().length()>0) {
                arrayList.add(content17.getText().toString());
            }
            if(content18.getText().length()>0) {
                arrayList.add(content18.getText().toString());
            }
            if(content19.getText().length()>0) {
                arrayList.add(content19.getText().toString());
            }
            if(content20.getText().length()>0) {
                arrayList.add(content20.getText().toString());
            }
//            arrayList.add(content3.getText().toString());
            length=arrayList.size();
            handler.post(runnable);
        }
    }
    class Button_start_chi implements View.OnClickListener{

        @Override
        public void onClick(View v) {

        }
    }
    class endButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            i=0;
            arrayList.clear();
            content1.setText("");
            content2.setText("");
            content3.setText("");
            content4.setText("");
            content5.setText("");
            content6.setText("");
            content7.setText("");
            content8.setText("");
            content9.setText("");
            content10.setText("");
            content11.setText("");
            content12.setText("");
            content13.setText("");
            content14.setText("");
            content15.setText("");
            content16.setText("");
            content17.setText("");
            content18.setText("");
            content19.setText("");
            content20.setText("");
            time=5000;
            handler.removeCallbacks(runnable);
        }
    }
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            if(i<length) {
                tts.speak(arrayList.get(i),TextToSpeech.QUEUE_FLUSH,null);
                i++;
            }
            handler.postDelayed(runnable,time);
        }
    };
}
