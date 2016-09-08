package id.sch.smktelkom_mlg.xirpl4014tugas01.telkomschoolsorganization;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNama, tvEmail, tvHasil;
    EditText etNama, etEmail;
    Spinner spinnerKelas;
    RadioGroup rgJK;
    RadioButton rbL, rbP;
    CheckBox cbOSIS, cbMPK, cbPustel;
    Button bDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvEmail = (TextView) findViewById(R.id.textViewEmail);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        spinnerKelas = (Spinner) findViewById(R.id.spinnerKelas);
        rgJK = (RadioGroup) findViewById(R.id.radioGroupJK);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        cbOSIS = (CheckBox) findViewById(R.id.checkBoxOSIS);
        cbMPK = (CheckBox) findViewById(R.id.checkBoxMPK);
        cbPustel = (CheckBox) findViewById(R.id.checkBoxPustel);
        bDaftar = (Button) findViewById(R.id.buttonDaftar);

        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClicik();
            }
        });
    }

    private void doClicik() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            String email = etEmail.getText().toString();

        }

    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String email = etEmail.getText().toString();
        String hasil = null;

        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi!");
        } else {
            etNama.setError(null);
        }

        if (email.isEmpty()) {
            etEmail.setError("Email belum diisi!");
        } else {
            etEmail.setError(null);
        }

        if (rbL.isChecked()) {
            hasil = rbL.getText().toString();
        } else if (rbP.isChecked()) {
            hasil = rbP.getText().toString();
        }
        if (hasil == null) {
            tvHasil.setText("Belum memilih jenis kelamin!");
        } else {
            tvHasil.setText("");
        }
        return false;
    }
}
