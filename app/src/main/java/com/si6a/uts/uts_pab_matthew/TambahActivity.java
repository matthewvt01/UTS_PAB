package com.si6a.uts.uts_pab_matthew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TambahActivity extends AppCompatActivity {
    private EditText etNama, etKota, etAlamat;
    private Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        etNama = findViewById(R.id.et_namakampus);
        etKota = findViewById(R.id.et_kota);
        etAlamat = findViewById(R.id.et_alamat);
        btnSimpan = findViewById(R.id.btn_simpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNama = etNama.getText().toString();
                String getKota = etKota.getText().toString();
                String getAlamat = etAlamat.getText().toString();

                if(getNama.trim().equals("")){
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else if(getKota.trim().equals("")) {
                    etKota.setError("Kota Tidak Boleh Kosong");
                }
                else if(getAlamat.trim().equals("")) {
                    etAlamat.setError("Alamat Tidak Boleh Kosong");
                }
                else{
                    MyDatabaseHelper myDB = new MyDatabaseHelper(TambahActivity.this);
                    long eksekusi = myDB.tambahkampus(getNama, getKota, getAlamat);
                }
            }
        });

    }
}