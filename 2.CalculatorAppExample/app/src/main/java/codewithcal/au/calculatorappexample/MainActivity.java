package codewithcal.au.calculatorappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



/*
    TASKS:
    1. Search for the the other UI components and know the role of each one.
        • exists at the palette table in the xml-Design
        • Also, check this helpful website: https://material.io/components?platform=android
        • General advice: Android Documentation and StackOverFlow are the best resources to search at
          & Make sure the search result is up-to-date and not an old deprecate one since Android is always upgrading.

    2. Make the layout of the calculator at activity_main.xml

    3. Complete the "Calculate" method to calculate the result in MainActivity.java

    4. Set methods for the rest of the buttons in MainActivity.java
      • the division btn, and no.9 btn are shown as example
      -> please DON'T copy and paste for these methods,
        PRACTICE is the key to improve your coding skills!

       ••• Best of luck ;)
 */

public class MainActivity extends AppCompatActivity
{

    TextView workingsTV;
    TextView resultsTV;
    String LHS="";
    String operation="";
    String workings = "";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Note: change these IDs to what you defined them in the xml file
        workingsTV = (TextView)findViewById(R.id.workingsTextView);
        resultsTV = (TextView)findViewById(R.id.resultTextView);    }


    private void setWorkings(String givenValue)
    {
        workings = workings + givenValue;
       workingsTV.setText(workings);

    }


    public String calculate(String LHS,String operation,String RHS){

        double res=0.0;
        //Complete this method to calculate the result
        //Don't forget to parse the strings (LHS & RHS) into DOUBLE
        return res + "";
    }


    public void equalsOnClick(View view) {
        String RHS = resultsTV.getText().toString();
        String res= calculate(LHS,operation,RHS);
        LHS=res;
        operation="";
        resultsTV.setText(res);
    }




    public void clearOnClick(View view)
    {
        workingsTV.setText("");
        workings = "0";
        resultsTV.setText("");
    }


    //Just like this method, set other methods for the (+, -, *) operatins
    //Don't forget to add this attribute in the button tag at the xml file (( android:onClick="divisionOnClick" ))
    public void divisionOnClick(View view)
    {
        Button operator= ((Button) view);
        setWorkings("/");
        if(operation.isEmpty()){
            LHS = resultsTV.getText().toString();
        } else  {
            String RHS = resultsTV.getText().toString();
            LHS = calculate(LHS,operation,RHS);
        }
        operation=operator.getText().toString();

    }

    //Just like this method, set other methods for the (0,1,2,3,4,5,6,7,8) numbers and dot (.)
    //Don't forget to add this attribute in the button tag at the xml file (( android:onClick="nineOnClick" ))
    public void nineOnClick(View view)
    {
        Button button= ((Button) view);
       // Button btn = (Button)findViewById(R.id.button3);
        setWorkings("9");
        String btnTxt = button.getText().toString();
        resultsTV.setText(btnTxt);

    }




}