package ifpb.edu.br.calculadoraapplication.Listeners;

import android.app.Activity;
import android.media.MediaCodec;
import android.util.Log;
import android.view.View;

import java.util.regex.Pattern;

import ifpb.edu.br.calculadoraapplication.MainActivity;

/**
 * Created by root on 17/09/16.
 */
public class OnClickEqual implements View.OnClickListener {
    MainActivity main;
    public static String result;

    public OnClickEqual(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {

        String operation[] = main.display.split(Pattern.quote(main.currentOperator));
        if(operation.length < 2) return;
        result = String.valueOf(operate(operation[0], operation[1], main.currentOperator));
        main.hasResult = true;
        main.txtScreen.setText(result);

    }

    public double operate(String x, String y, String op){
        switch (op){
            case "+": return Double.valueOf(x) + Double.valueOf(y);
            case "-": return Double.valueOf(x) - Double.valueOf(y);
            case "*": return Double.valueOf(x) * Double.valueOf(y);
            case "/": return Double.valueOf(x) / Double.valueOf(y);
            default: return -1;
        }

    }
}
