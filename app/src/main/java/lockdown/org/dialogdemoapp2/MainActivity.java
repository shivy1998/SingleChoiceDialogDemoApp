package lockdown.org.dialogdemoapp2;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnDialog;
    String arr[] = {"Java","Android","Python","Machine Learning"};
    String selecteditem = "";
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnDialog=findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Courses Offered");
                ab.setSingleChoiceItems(arr, -1, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int i)
                    {
                        selecteditem = arr[i];
                    }
                });
                ab.setPositiveButton("Show", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int i)
                    {
                        Toast.makeText(MainActivity.this, selecteditem+" is selected",Toast.LENGTH_SHORT).show();
                    }
                });
                ab.show();
            }
        });
    }
}