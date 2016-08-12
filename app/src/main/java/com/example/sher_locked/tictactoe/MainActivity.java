package com.example.sher_locked.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isTrueOrFalse = true;
    boolean gameOver = true;

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) this.findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.gameon);

        b1 = (Button) this.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b1);

            }
        });

        b2 = (Button) this.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b2);

            }
        });

        b3 = (Button) this.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b3);

            }
        });

        b4 = (Button) this.findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b4);

            }
        });

        b5 = (Button) this.findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b5);

            }
        });

        b6 = (Button) this.findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b6);

            }
        });

        b7 = (Button) this.findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b7);

            }
        });

        b8 = (Button) this.findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b8);

            }
        });

        b9 = (Button) this.findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printXorZero(b9);

            }
        });

        b10 = (Button) this.findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();

            }
        });

    }

    private void refresh() {
        b1.setText("CHOOSE ME");
        b2.setText("CHOOSE ME");
        b3.setText("CHOOSE ME");
        b4.setText("CHOOSE ME");
        b5.setText("CHOOSE ME");
        b6.setText("CHOOSE ME");
        b7.setText("CHOOSE ME");
        b8.setText("CHOOSE ME");
        b9.setText("CHOOSE ME");

        isTrueOrFalse = true;
        gameOver = true;

        iv.setImageResource(R.drawable.gameon);
    }

    private void printXorZero(Button b) {
        if (gameOver) {
            if (b.getText().toString().equals("CHOOSE ME")) {

                if (isTrueOrFalse) {
                    b.setText(" X ");
                    //Toast.makeText(this, "GREAT CHOICE !", Toast.LENGTH_SHORT).show();
                } else {
                    b.setText(" 0 ");
                    //Toast.makeText(this, "GREAT CHOICE !", Toast.LENGTH_SHORT).show();
                }

                if (isWin1() || isWin2() || isWin3() || isWinC1() || isWinC2() || isWinC3() || isWinD1() || isWinD2()) {
                    //ImageView iv = (ImageView) this.findViewById(R.id.imageView);
                    iv.setImageResource(R.drawable.go);
                    gameOver = !gameOver;
                }

                isTrueOrFalse = !isTrueOrFalse;
            }
        }
    }

    private boolean isEmpty(Button b) {
        if (b.getText().toString().equals("CHOOSE ME")) {
            return true;
        }
        return false;
    }

    private boolean isRowEmpty(Button a, Button b, Button c) {
        if (isEmpty(a) && isEmpty(b) && isEmpty(c)) {
            return true;
        }
        return false;
    }

    private boolean isWin1() {
        if (!isRowEmpty(b1, b2, b3)) {
            if (b1.getText().toString().trim().equals(b2.getText().toString().trim()) && b1.getText().toString().trim().equals(b3.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWin2() {
        if (!isRowEmpty(b4, b5, b6)) {
            if (b4.getText().toString().trim().equals(b5.getText().toString().trim()) && b4.getText().toString().trim().equals(b6.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWin3() {
        if (!isRowEmpty(b7, b8, b9)) {
            if (b7.getText().toString().trim().equals(b8.getText().toString().trim()) && b7.getText().toString().trim().equals(b9.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWinC1() {
        if (!isRowEmpty(b1, b4, b7)) {
            if (b1.getText().toString().trim().equals(b4.getText().toString().trim()) && b1.getText().toString().trim().equals(b7.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWinC2() {
        if (!isRowEmpty(b2, b5, b8)) {
            if (b2.getText().toString().trim().equals(b5.getText().toString().trim()) && b2.getText().toString().trim().equals(b8.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWinC3() {
        if (!isRowEmpty(b3, b6, b9)) {
            if (b3.getText().toString().trim().equals(b6.getText().toString().trim()) && b3.getText().toString().trim().equals(b9.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWinD1() {
        if (!isRowEmpty(b1, b5, b9)) {
            if (b1.getText().toString().trim().equals(b5.getText().toString().trim()) && b1.getText().toString().trim().equals(b9.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isWinD2() {
        if (!isRowEmpty(b3, b5, b7)) {
            if (b3.getText().toString().trim().equals(b5.getText().toString().trim()) && b3.getText().toString().trim().equals(b7.getText().toString().trim())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
