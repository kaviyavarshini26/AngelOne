package com.example.bottomnavigation;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class KeypadActivity extends AppCompatActivity {
//
//    private ImageView imageView;
//    private TextView textview1, textView2, textView3, textView4;
//    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
//    private View view;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_keypad);
//
//        imageView = findViewById(R.id.imageview1thumb);
//        button0 = findViewById(R.id.button0);
//        button1 = findViewById(R.id.button1);
//        button2 = findViewById(R.id.button2);
//        button3 = findViewById(R.id.button3);
//        button4 = findViewById(R.id.button4);
//        button5 = findViewById(R.id.button5);
//        button6 = findViewById(R.id.button6);
//        button7 = findViewById(R.id.button7);
//        button8 = findViewById(R.id.button8);
//        button9 = findViewById(R.id.button9);
//        public void onKeypadButtonClick(View view){
//            Button button = (Button) view;
//            String number = button.getText().toString();
//
//            TextView r1 = findViewById(R.id.r1);
//            TextView r2 = findViewById(R.id.r2);
//            TextView r3 = findViewById(R.id.r3);
//            TextView r4 = findViewById(R.id.r4);
//
//            // Check if any rounded TextView is empty and update its text
//            if (r1.getText().toString().isEmpty()) {
//                r1.setText(number);
//            } else if (r2.getText().toString().isEmpty()) {
//                r2.setText(number);
//            } else if (r3.getText().toString().isEmpty()) {
//                r3.setText(number);
//            } else if (r4.getText().toString().isEmpty()) {
//                r4.setText(number);
//            }
//        }
////        button0.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "0");
////            }
////        });
////        button1.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "1");
////            }
////        });
////        button2.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "2");
////            }
////        });
////        button3.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "3");
////            }
////        });
////        button4.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "4");
////            }
////        });
////        button5.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "5");
////            }
////        });
////        button6.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "6");
////            }
////        });
////        button7.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "7");
////            }
////        });
////        button8.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "8");
////            }
////        });
////        button9.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Button button = (Button) v;
////                String currentText = button.getText().toString();
////                button.setText(currentText + "9");
////            }
////        });
//
//    }
//}
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KeypadActivity extends AppCompatActivity implements View.OnClickListener {

    private StringBuilder pinBuilder;
    private TextView r1, r2, r3, r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keypad);

        // Initialize the StringBuilder to store the PIN
        pinBuilder = new StringBuilder();

        // Get references to the rounded TextViews
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);

        // Set click listeners for the keypad buttons
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String number = button.getText().toString();

        // Check if any rounded TextView is empty and set the number
        if (r1.getText().toString().isEmpty()) {
            r1.setText(number);
            pinBuilder.append(number);
        } else if (r2.getText().toString().isEmpty()) {
            r2.setText(number);
            pinBuilder.append(number);
        } else if (r3.getText().toString().isEmpty()) {
            r3.setText(number);
            pinBuilder.append(number);
        } else if (r4.getText().toString().isEmpty()) {
            r4.setText(number);
            pinBuilder.append(number);

            // Check the entered PIN when all rounded TextViews are filled
            checkPin();
        }
    }

    private void checkPin() {
        String enteredPin = pinBuilder.toString();
        String correctPin = "1234"; // Replace with your correct PIN

        // Clear the PIN builder
        pinBuilder.setLength(0);

        // Check if the entered PIN matches the correct PIN
        if (enteredPin.equals(correctPin)) {

            // PIN is correct, navigate to MainActivity
            Intent intent = new Intent(KeypadActivity.this, MainActivity1.class);
            startActivity(intent);
            finish();
        } else {
            // PIN is incorrect, clear the rounded TextViews
            clearRoundedTextViews();
        }
    }

    private void clearRoundedTextViews() {
        r1.setText("");
        r2.setText("");
        r3.setText("");
        r4.setText("");
    }
}



