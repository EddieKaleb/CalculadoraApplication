package ifpb.edu.br.calculadoraapplication.Listeners;

import android.view.View;

import ifpb.edu.br.calculadoraapplication.MainActivity;

/**
 * Created by root on 17/09/16.
 */
public class OnClickPonto implements View.OnClickListener{


    MainActivity main;

    public OnClickPonto(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        if(!main.display.equals("") && main.hasPonto == false){
            main.display += ".";
            main.hasPonto = true;
            main.updateScreen();
        }
    }
}
