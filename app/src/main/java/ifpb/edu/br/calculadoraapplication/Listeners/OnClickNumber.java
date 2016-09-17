package ifpb.edu.br.calculadoraapplication.Listeners;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import ifpb.edu.br.calculadoraapplication.MainActivity;

/**
 * Created by root on 17/09/16.
 */
public class OnClickNumber  implements View.OnClickListener{


    MainActivity main;

    public OnClickNumber(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        main.display += b.getText();
        main.updateScreen();
    }
}
