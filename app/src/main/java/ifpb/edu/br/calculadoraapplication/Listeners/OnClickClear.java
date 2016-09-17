package ifpb.edu.br.calculadoraapplication.Listeners;

import android.view.View;

import ifpb.edu.br.calculadoraapplication.MainActivity;

/**
 * Created by root on 17/09/16.
 */
public class OnClickClear implements View.OnClickListener {

    MainActivity main;

    public OnClickClear(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        main.display = "";
        main.currentOperator = "";
        main.hasPonto = false;
        main.hasOperator = false;
        main.hasResult = false;
        main.updateScreen();
    }
}
