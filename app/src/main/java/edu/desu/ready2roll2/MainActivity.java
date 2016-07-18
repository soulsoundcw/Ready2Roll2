package edu.desu.ready2roll2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Menu category
        TextView menu = (TextView) findViewById(R.id.button);

        // Set a click listener on that View
        menu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the menu category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OrderActivity}
                Intent menuIntent = new Intent(MainActivity.this, MenuActivity.class);

                // Start the new activity
                startActivity(menuIntent);
            }
        });
    }
            //Method for when the Email button is clicked
            public void button(View view) {
            Intent sendEmail = new Intent(Intent.ACTION_SENDTO);
            sendEmail.setData(Uri.parse("mailto:")); // only email apps should handle this
            sendEmail.putExtra(Intent.EXTRA_SUBJECT, "I would like more information on how to order");
            if (sendEmail.resolveActivity(getPackageManager()) != null) {
            startActivity(sendEmail);
        }
    }
}