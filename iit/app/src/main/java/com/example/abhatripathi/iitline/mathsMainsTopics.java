package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class mathsMainsTopics extends AppCompatActivity {

Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_topics);
        btn1=findViewById(R.id.mathsMainschapter1);
        btn2=findViewById(R.id.mathsMainschapter2);
        btn3=findViewById(R.id.mathsMainschapter3);
        btn4=findViewById(R.id.mathsMainschapter4);
        btn5=findViewById(R.id.mathsMainschapter5);
        btn6=findViewById(R.id.mathsMainschapter6);
        btn7=findViewById(R.id.mathsMainschapter7);
        btn8=findViewById(R.id.mathsMainschapter8);
        btn9=findViewById(R.id.mathsMainschapter9);
        btn10=findViewById(R.id.mathsMainschapter10);
        btn11=findViewById(R.id.mathsMainschapter11);
        btn12=findViewById(R.id.mathsMainschapter12);
        btn13=findViewById(R.id.mathsMainschapter13);
        btn14=findViewById(R.id.mathsMainschapter14);
        btn15=findViewById(R.id.mathsMainschapter15);
        btn16=findViewById(R.id.mathsMainschapter16);
        btn17=findViewById(R.id.mathsMainschapter17);
        btn18=findViewById(R.id.mathsMainschapter18);
        btn19=findViewById(R.id.mathsMainschapter19);
        btn20=findViewById(R.id.mathsMainschapter20);
        btn21=findViewById(R.id.mathsMainschapter21);
        btn22=findViewById(R.id.mathsMainschapter22);
        btn23=findViewById(R.id.mathsMainschapter23);
        btn24=findViewById(R.id.mathsMainschapter24);
        btn25=findViewById(R.id.mathsMainschapter25);
        btn26=findViewById(R.id.mathsMainschapter26);
        btn27=findViewById(R.id.mathsMainschapter27);
        btn28=findViewById(R.id.mathsMainschapter28);
        btn29=findViewById(R.id.mathsMainschapter29);
        btn30=findViewById(R.id.mathsMainschapter30);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gWRQqAtQzCw?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3xaZtmRcOpc?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mfK7OUe7whs?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rR4d5jRVlJg?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/W1vNK7rbrB8?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ay215LJFhFs?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XmOVrXQ_QPk?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zznGGAHx_os?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C_W43TZtg5w?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aerE1DMe6iA?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3p0ln7O_-ag?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/X0Yy89LVGFw?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/owRHEbvqAP8?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yuJHB2cLDkg?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yZ1XDY7nGxE?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NbA9Hsz1FrY?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
//                fragobj.setArguments(bundle);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CK2fU6UZIrs?list=PLFcidHFGx2VTWwwiEojGZb__oYsqd2H23\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qdKZdk7MsOM?list=PLFcidHFGx2VTWwwiEojGZb__oYsqd2H23\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C61E1rUDXtY?list=PLFcidHFGx2VTWwwiEojGZb__oYsqd2H23\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uhX7TdJn-M8?list=PLFcidHFGx2VTWwwiEojGZb__oYsqd2H23\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/q2YdUmw54Ng?list=PLFcidHFGx2VTWwwiEojGZb__oYsqd2H23\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));


                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2OWGLoHhq-w\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FR2DxgYHEdQ?list=PLFcidHFGx2VQp8nO0i75RveB8T8zMbf1d\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HrbWK44FXbA?list=PLFcidHFGx2VQp8nO0i75RveB8T8zMbf1d\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZKmunF_Xn1s?list=PLFcidHFGx2VQp8nO0i75RveB8T8zMbf1d\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5RrBBZFkegU?list=PLFcidHFGx2VQp8nO0i75RveB8T8zMbf1d\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/27fJoxkeL1k?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fGzkR8A_x84?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jYfTo-lD66U?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9HDUANDQN1o?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-PVJlmOkHYQ?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FdbbuwR5oqs?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZJ7jfr2WvaQ?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7_8sqSUXcdQ?list=PLv1eiTcEnTUoJHznX1oLGIL5bqulUH86g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5xsD0JkjanE?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3SxIo0L5B6c?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/55XP6OwhZT8?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7HHl1TbJLe4?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8D7EHqEdYls?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/arNGmfe1iQI?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/o0sjz0tllp8?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/o5EeuEsb-Nw?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3QT6k8guMzw?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zb22lJ1F0oQ?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/l1726aYy89A?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_U9bx9jI8J4?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n3C6C1aXjB4?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vrGhou7Cns8?list=PLmrEq8IaMha81d96cK3joFtcXXuuaroOL\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
                Bundle bundle=new Bundle();
                bundle.putParcelableArrayList("video",  youtubevideos);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
//        btn11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ArrayList<itemVideo> youtubevideos= new ArrayList<>();
//                Bundle bundle=new Bundle();
//                bundle.putParcelableArrayList("video",  youtubevideos);
//                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
//                i.putExtras(bundle);
//                startActivity(i);
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

    }
}
