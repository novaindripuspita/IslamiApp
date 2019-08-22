package com.novaindripuspita.islamiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoa extends AppCompatActivity {
    private TextView Getdoa, Getarab , Getbaca , Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }
    @SuppressLint("SetTextI18n")
    private void showData () {
        String doa = getIntent().getExtras().getString("MyName");
        switch (doa){
            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar ");
                Getarti.setText("Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka ");
                break;

            case "Doa Ketika Mimpi Buruk":
                Getdoa.setText("Doa Ketika Mimpi Buruk");
                Getarab.setText("اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَم" );
                Getbaca.setText("Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami" );
                Getarti.setText("Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami" );
                break;
            case "Doa Masuk Kamar Mandi":
                Getdoa.setText("Doa Masuk Kamar Mandi");
                Getarab.setText("اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِث" );
                Getbaca.setText("Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi" );
                Getarti.setText("Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan");
                break;
            case "Doa Bercermin":
                Getdoa.setText("Doa Bercermin");
                Getarab.setText("اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ" );
                Getbaca.setText("Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii");
                Getarti.setText("Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku");
                break;

            case "Doa Gosok Gigi":
                Getdoa.setText("Doa Gosok Gigi");
                Getarab.setText("اَللَّهُمَّ بَيِّضْ بِهِ أَسْنَانِيْ وَشُدَّ بِهِ لِثَّتِيْ وَثَبِّتْ بِهِ لَهَاتِي وَأَفْصِحْ بِهِ لِسَانِيْ وَبَارِكْ لِيْ فِيْهِ وَأَثِبْنِيْ عَلَيْهِ يَآ أَرْحَمَ الرَّاحِمِيْنَ");
                Getbaca.setText("ALLAHUMMA BAYYIDH BIHI ASNAANII WA SYUDDA BIHI LITSTSATII WA TSABBIT BIHI LAHAATII WA AFSHIH BIHI LISAANII WABAARIK LII FIIHI WA ATSBITNII ‘ALAIHI YAA ARHAMARROOHIMIIN");
                Getarti.setText("Ya Allah putihkan gigiku dan kuatkan gusiku, serta kuatkan lahatku (daging yang tumbuh di atas langit-langit mulut), fasihkan lidahku, berkatilah aku, dan berikan aku pahala karena siwak wahai Dzat yang paling mengasihi di antara para pengasih.");
                break;

        }

    }
}

