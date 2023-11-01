package com.example.soundvault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private ListView listItems;
    private Adaptador adaptador;
    private ArrayList<ListViewLayout> arrayListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    protected void onResume() {
        super.onResume();

        listItems = (ListView) findViewById(R.id.listItems);
        arrayListView = GetArrayItems();
        adaptador = new Adaptador(this, arrayListView);
        listItems.setAdapter(adaptador);

        listItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("objetoData", arrayListView.get(position));
                startActivity(intent);
            }
        });
    }

    private ArrayList<ListViewLayout> GetArrayItems(){
        ArrayList<ListViewLayout> listItems = new ArrayList<>();
        listItems.add(new ListViewLayout(R.drawable.vespertine_cover, "Vespertine","Björk","\"Vespertine\" es el cuarto álbum de estudio de Björk, lanzado en 2001. Es un álbum experimental que combina música electrónica con arreglos orquestales, y explora temas de intimidad y amor. El álbum recibió críticas positivas y se considera uno de los trabajos más originales de Björk.","Tracklist:\n\n" +"1. \"Hidden Place\"\n" +
                "2. \"Cocoon\"\n" +
                "3. \"It's Not Up to You\"\n" +
                "4. \"Undo\"\n" +
                "5. \"Pagan Poetry\"\n" +
                "6. \"Frosti\"\n" +
                "7. \"Aurora\"\n" +
                "8. \"An Echo, a Stain\"\n" +
                "9. \"Sun in My Mouth\"\n" +
                "10. \"Heirloom\"\n" +
                "11. \"Harm of Will\"\n" +
                "12. \"Unison\""));
        listItems.add(new ListViewLayout(R.drawable.blueweekend_cover, "Blue Weekend","Wolf Alice","\"Blue Weekend\" es el tercer álbum de estudio de la banda británica Wolf Alice, lanzado en 2021. Este álbum presenta una mezcla de estilos que abarcan el rock alternativo, el dream pop y la música indie. Las letras exploran temas como el amor, la libertad y la introspección. \"Blue Weekend\" ha sido elogiado por su sonido expansivo y las interpretaciones emocionales de la banda.","Tracklist:\n" +
                "\n" +
                "1. \"The Beach\"\n" +
                "2. \"Delicious Things\"\n" +
                "3. \"Lipstick on the Glass\"\n" +
                "4. \"Smile\"\n" +
                "5. \"Safe from Heartbreak (if you never fall in love)\"\n" +
                "6. \"How Can I Make It OK?\"\n" +
                "7. \"Play the Greatest Hits\"\n" +
                "8. \"Feeling Myself\"\n" +
                "9. \"The Last Man on Earth\"\n" +
                "10. \"No Hard Feelings\"\n" +
                "11. \"The Beach II\""));
        listItems.add(new ListViewLayout(R.drawable.sawayama_cover, "Sawayama","Rina Sawayama","\"Sawayama\" es el álbum debut de la cantante y compositora británico-japonesa Rina Sawayama, lanzado en 2020. Este álbum es una obra diversa que abarca una amplia gama de géneros musicales, incluyendo pop, R&B, rock y electrónica. Rina Sawayama explora temas de identidad, pertenencia y autenticidad en sus letras. \"Sawayama\" recibió aclamación crítica y se ha destacado por su originalidad y versatilidad.","Tracklist:\n" +
                "\n" +
                "1. \"Dynasty\"\n" +
                "2. \"XS\"\n" +
                "3. \"STFU!\"\n" +
                "4. \"Comme des Garçons (Like the Boys)\"\n" +
                "5. \"Akasaka Sad\"\n" +
                "6. \"Paradisin'\"\n" +
                "7. \"Love Me 4 Me\"\n" +
                "8. \"Bad Friend\"\n" +
                "9. \"F*** This World (Interlude)\"\n" +
                "10. \"Who's Gonna Save U Now?\"\n" +
                "11. \"Tokyo Love Hotel\"\n" +
                "12. \"Chosen Family\"\n" +
                "13. \"Snakeskin\""));
        listItems.add(new ListViewLayout(R.drawable.dirtycomputer_cover, "Dirty Computer","Janelle Monáe","\"Dirty Computer\" es el tercer álbum de estudio de la cantante, compositora y actriz Janelle Monáe, lanzado en 2018. Este álbum es un viaje musical y visual que abarca géneros como el pop, el R&B y el funk, y presenta una narrativa de ciencia ficción que explora la identidad, la liberación y la aceptación. \"Dirty Computer\" ha sido ampliamente elogiado por su innovación y su mensaje de empoderamiento.","Tracklist:\n\n" +"1. \"Dirty Computer\" (featuring Brian Wilson)\n" +
                "2. \"Crazy, Classic, Life\"\n" +
                "3. \"Take a Byte\"\n" +
                "4. \"Jane's Dream\"\n" +
                "5. \"Screwed\" (featuring Zoë Kravitz)\n" +
                "6. \"Django Jane\"\n" +
                "7. \"Pynk\" (featuring Grimes)\n" +
                "8. \"Make Me Feel\"\n" +
                "9. \"I Got the Juice\" (featuring Pharrell Williams)\n" +
                "10. \"I Like That\"\n" +
                "11. \"Don't Judge Me\"\n" +
                "12. \"Stevie's Dream\"\n" +
                "13. \"So Afraid\"\n" +
                "14. \"Americans\""));
        listItems.add(new ListViewLayout(R.drawable.jubilee_cover, "Jubilee","Japanese Breakfast","\"Jubilee\" es el tercer álbum de estudio de la cantante y compositora Michelle Zauner, conocida artísticamente como Japanese Breakfast, lanzado en 2021. Este álbum es una exploración musical vibrante que fusiona elementos del pop, el rock y la música indie. \"Jubilee\" ha sido elogiado por su creatividad y letras personales que tocan temas de autodescubrimiento y superación.","Tracklist:\n\n" +"1. \"Paprika\"\n" +
                "2. \"Be Sweet\"\n" +
                "3. \"Kokomo, IN\"\n" +
                "4. \"Slide Tackle\"\n" +
                "5. \"Posing in Bondage\"\n" +
                "6. \"Sit\"\n" +
                "7. \"Savage Good Boy\"\n" +
                "8. \"In Hell\"\n" +
                "9. \"Tactics\"\n" +
                "10. \"Posing for Cars\""));
        listItems.add(new ListViewLayout(R.drawable.melodrama_cover, "Melodrama","Lorde","\"Melodrama\" es el segundo álbum de estudio de la cantante neozelandesa Lorde, lanzado en 2017. Este álbum es un viaje a través de las emociones y las experiencias de la vida joven y adulta, explorando temas de amor, desamor y celebración. \"Melodrama\" recibió elogios de la crítica y es conocido por su estilo musical distintivo y sus letras sinceras.","Tracklist:\n" +
                "\n" +
                "1. \"Green Light\"\n" +
                "2. \"Sober\"\n" +
                "3. \"Homemade Dynamite\"\n" +
                "4. \"The Louvre\"\n" +
                "5. \"Liability\"\n" +
                "6. \"Hard Feelings/Loveless\"\n" +
                "7. \"Sober II (Melodrama)\"\n" +
                "8. \"Writer in the Dark\"\n" +
                "9. \"Supercut\"\n" +
                "10. \"Liability (Reprise)\"\n" +
                "11. \"Perfect Places\""));
        listItems.add(new ListViewLayout(R.drawable.tarantula_cover, "Tarántula","Mónica Naranjo","\"Tarántula\" es el cuarto álbum de estudio de la cantante española Mónica Naranjo, lanzado en 2008. Este álbum marca un cambio en el estilo de Naranjo, ya que se adentra en el rock y la electrónica, alejándose de sus trabajos anteriores más orientados al pop. \"Tarántula\" es un álbum conceptual con letras introspectivas y a menudo oscilantes entre lo sensual y lo oscuro.","Tracklist:\n\n" +"1. \"Europa\"\n" +
                "2. \"Todo Mentira\"\t\n" +
                "3. \"Usted\"\n" +
                "4. \"Para Siempre\"\t\n" +
                "5. \"Amor y Lujo\"\t\n" +
                "6. \"Idilio\"\t\n" +
                "7. \"Diles Que No\"\t\n" +
                "8. \"Kambalaya\"\t\n" +
                "9. \"Eva\"\t\n" +
                "10. \"Amor y Posesión\"\t\n" +
                "11. \"Revolución\""));
        listItems.add(new ListViewLayout(R.drawable.a1989_cover, "1989 (Taylor's Version)","Taylor Swift","1989 (Taylor's Version) es el cuarto álbum de estudio regrabado de la cantautora estadounidense Taylor Swift, lanzado en 2023 a través de Republic Records. Es una regrabación de su quinto álbum de estudio 1989 (2014). Este álbum marca un cambio significativo en el estilo musical de Swift, alejándose del country y adentrándose en el pop. \"1989\" está inspirado en la música de la década de 1980 y se centra en temas de amor, desamor y crecimiento personal.","Tracklist:\n" +
                "\n" +
                "1. \"Welcome to New York\"\t\n" +
                "2. \"Blank Space\"\t\n" +
                "3. \"Style\"\t\n" +
                "4. \"Out of the Woods\"\t\n" +
                "5. \"All You Had to Do Was Stay\"\t\n" +
                "6. \"Shake It Off\"\t\n" +
                "7. \"I Wish You Would\"\t\n" +
                "8. \"Bad Blood\"\t\n" +
                "9. \"Wildest Dreams\"\t\n" +
                "10. \"How You Get the Girl\"\t\n" +
                "11. \"This Love\"\t\n" +
                "12. \"I Know Places\"\t\n" +
                "13. \"Clean\"\t\n" +
                "14. \"Wonderland\"\t\n" +
                "15. \"You Are in Love\"\t\n" +
                "16. \"New Romantics\"\t\n" +
                "17. \"Slut!\"\t\n" +
                "18. \"Say Don't Go\"\t\n" +
                "19. \"Now That We Don't Talk\"\t\n" +
                "20. \"Suburban Legends\"\t\n" +
                "21. \"Is It Over Now?\""));
        listItems.add(new ListViewLayout(R.drawable.desireiwanttoturnintoyou_cover, "Desire I Want To Turn Into You","Caroline Polacheck","Desire, I Want to Turn Into You es el cuarto álbum de estudio de la cantautora y productora estadounidense Caroline Polachek, y el segundo bajo su nombre artístico. Lanzado en 2023 por Sony Music, The Orchard y el sello Perpetual Novice de Polachek. El mejor álbum de la carrera de Caroline Polachek es una experiencia pop transformadora, una odisea apasionada y ricamente melódica en los rincones más oscuros del amor.","Tracklist:\n\n" +"1. \"Welcome to My Island\"\t\n" +
                "2. \"Pretty in Possible\"\n" +
                "3. \"Bunny Is a Rider\"\t \t \t\n" +
                "4. \"Sunset\"\t\n" +
                "5. \"Crude Drawing of an Angel\"\t \t \t\n" +
                "6. \"I Believe\"\t\n" +
                "7. \"Fly to You\" (featuring Grimes and Dido)\t\n" +
                "8. \"Blood and Butter\"\t \t \t\n" +
                "9. \"Hopedrunk Everasking\"\t \t \t\n" +
                "10. \"Butterfly Net\"\t \t \t\n" +
                "11. \"Smoke\"\t \t \t\n" +
                "12. \"Billions\""));

        return listItems;
    }
}