package ifpb.edu.br.calculadoraapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import ifpb.edu.br.calculadoraapplication.Listeners.OnClickClear;
import ifpb.edu.br.calculadoraapplication.Listeners.OnClickEqual;
import ifpb.edu.br.calculadoraapplication.Listeners.OnClickNumber;
import ifpb.edu.br.calculadoraapplication.Listeners.OnClickOperator;
import ifpb.edu.br.calculadoraapplication.Listeners.OnClickPonto;

public class MainActivity extends Activity {
    public static TextView txtScreen;
    public static String display = "";
    public static String currentOperator = "";
    public static boolean hasPonto = false;
    public static boolean hasOperator = false;
    public static boolean hasResult = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);

        btn0.setOnClickListener(new OnClickNumber(this));
        btn1.setOnClickListener(new OnClickNumber(this));
        btn2.setOnClickListener(new OnClickNumber(this));
        btn3.setOnClickListener(new OnClickNumber(this));
        btn4.setOnClickListener(new OnClickNumber(this));
        btn5.setOnClickListener(new OnClickNumber(this));
        btn6.setOnClickListener(new OnClickNumber(this));
        btn7.setOnClickListener(new OnClickNumber(this));
        btn8.setOnClickListener(new OnClickNumber(this));
        btn9.setOnClickListener(new OnClickNumber(this));

        Button btnSum = (Button) findViewById(R.id.btnSum);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnMult = (Button) findViewById(R.id.btnMult);
        Button btnDel = (Button) findViewById(R.id.btnDel);
        Button btnPonto = (Button) findViewById(R.id.btnPonto);
        Button btnIgual = (Button) findViewById(R.id.btnIgual);

        btnSum.setOnClickListener(new OnClickOperator(this));
        btnSub.setOnClickListener(new OnClickOperator(this));
        btnDiv.setOnClickListener(new OnClickOperator(this));
        btnMult.setOnClickListener(new OnClickOperator(this));

        btnIgual.setOnClickListener(new OnClickEqual(this));
        btnPonto.setOnClickListener(new OnClickPonto(this));

        txtScreen = (TextView) findViewById(R.id.txtScreen);
        txtScreen.setText(display);
        btnDel.setOnClickListener(new OnClickClear(this));

    }

    public void updateScreen(){
        txtScreen.setText(display);
    }

}
