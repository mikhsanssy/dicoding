package com.humam.ikhsanproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"M Ikhsan Syahbantyo", "Pantai Pink", "Pantai Tomini Bay", "Pantai Nihiwatu", "Pantai Pandawa.", "Pantai Derawan", "Pantai Gili", "Pantai Ora", "Pantai Sawarna", "Pantai Belitung", "Tanjung Bira"};
    String mDescription[] = {"Email : mikhsanssy@gmail.com",
            "Pulau komodo mempunyai pantai yang Disebut Pantai Pink karena pantai ini memiliki pasir pantai berwarna pink. Warna pink ini konon berasal dari serpihan karang dan biota lain yang terbawa arus ke daratan dan bercampur dengan pasir pantai.",
            "Tomini Bay terletak di Sulawesi Utara. Karena lokasinya yang tak jauh dari garis ekuator atau khatulistiwa, pantai ini menjadi tempat yang tepat untuk menikmati waktu bersantai dengan cara berjemur.",
            "Pantai Nihiwatu masuk dalam urutan ke-17 dalam daftar CNN World’s 100 Best Beaches In The World. Pantai ini memiliki pasir yang putih, air laut super jernih dan yang paling menarik perhatian wisatawan yang datang adalah pemandangan matahari terbenamnya yang super cantik.",
            "Pantai Pandawa adalah salah satu pantai terpencil di Bali dan memiliki julukan The Secret Beach. Terletak di Desa Kutuh, sebelah selatan Bali. com.example.sansproject.Pantai ini tersembunyi di balik tebing-tebing tinggi dan semak-semak. Disebut Secret Beach karena memang jalan untuk menuju pantai ini relatif sulit untuk diakses.",
            "Pulau Derawan masuk dalam urutan ke-63 dalam daftar CNN World’s 100 Best Beaches In The World. Pulau Derawan memiliki akomodasi yang sangat baik, itulah yang membuat tempat ini menjadi salah satu pantai favorit di Indonesia dan dunia.",
            "Pulau-pulau di Lombok atau yang lebih dikenal dengan sebutan “gili” memiliki ciri khas pantai berpasir putih, koral karang tropis yang indah, dan air laut biru yang jernih. Gili Trawangan menawarkan spot-spot diving yang spektakuler.",
            "Keindahan Pantai Ora serupa dengan Pantai Boracay di Filipina atau Pantai Bora-Bora di Samudera Pasifik. Di pantai ini terdapat Ora Beach Resort yang menyediakan 6 cottage.Pesona pantai ini adalah air laut super jernih, di mana Anda bisa menikmati langsung keindahan karang dan dunia bawah laut",
            "Pantai Sawarna menyuguhkan keindahan pemandangan deretan pohon kelapa dan air laut Samudera Hindia yang jernih. com.example.sansproject.Pantai Sawarna terletak di Desa Wisata Sawarna, Banten. com.example.sansproject.Pantai ini memiliki pasir putih yang kontras dengan langit dan laut biru. ",
            "Keindahan Pulau Belitung mulai terekspos sejak adanya film Laskar Pelangi. Meskipun pulau ini terkenal dengan lada putih dan pertambangan mineral jenis C seperti timah putih, pasir kuarsa, tanah liat putih (kaolin), dan batu-batu granit, tetapi pulau ini memiliki keindahan pantai yang super indah.",
            "Tanjung Bira adalah sebuah pantai alami yang terletak di Sulawesi Selatan.Pantai ini terkenal sebagai pantai berpasir seputih tepung. Anda bisa mencapai pantai ini dengan melakukan perjalanan dari Makassar selama kurang lebih 5 jam melewati Tanahberu dan dermaga Phinisi.",

    };
    int images[] = {R.drawable.mikhsanss, R.drawable.pink, R.drawable.tominibay, R.drawable.nihiwatu, R.drawable.pandawa, R.drawable.derawan, R.drawable.gili, R.drawable.ora, R.drawable.sawarna, R.drawable.belitung, R.drawable.bira};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    // also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    // also put your position
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    // also put your position
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                    // also put your position
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[9]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[9]);
                    intent.putExtra("description", mDescription[9]);
                    // also put your position
                    intent.putExtra("position", ""+9);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[10]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[10]);
                    intent.putExtra("description", mDescription[10]);
                    // also put your position
                    intent.putExtra("position", ""+10);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
