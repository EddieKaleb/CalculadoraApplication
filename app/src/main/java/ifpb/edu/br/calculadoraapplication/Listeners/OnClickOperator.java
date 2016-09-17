package ifpb.edu.br.calculadoraapplication.Listeners;

import android.view.View;
import android.widget.Button;

import ifpb.edu.br.calculadoraapplication.MainActivity;

/**
 * Created by root on 17/09/16.
 */
public class OnClickOperator implements View.OnClickListener{
    MainActivity main;

    public OnClickOperator(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        if(!main.display.equals("") && main.hasOperator == false ){
            main.display += b.getText();
            main.currentOperator = b.getText().toString();
            main.hasOperator = true;
            main.hasResult = true;
            main.updateScreen();
        }else if(main.hasResult == true){
            main.display = OnClickEqual.result + b.getText();
            main.currentOperator = b.getText().toString();
            main.updateScreen();
        }

    }

}

