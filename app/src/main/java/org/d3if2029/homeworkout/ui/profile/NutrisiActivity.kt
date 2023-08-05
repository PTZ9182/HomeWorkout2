package org.d3if2029.homeworkout.ui.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_nutrisi.*
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.FoodAdapter
import org.d3if2029.homeworkout.entity.Food

class NutrisiActivity : AppCompatActivity() {
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrisi)
        setSupportActionBar(toolbar_nutrisi_activity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // set back button action
        toolbar_nutrisi_activity.setNavigationOnClickListener {
            onBackPressed()
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        foodAdapter = FoodAdapter(generateFoodData()) { food ->
            showFoodDetailPage(food)
        }
        recyclerView.adapter = foodAdapter
    }
    // Method untuk menampilkan halaman deskripsi makanan
    private fun showFoodDetailPage(food: Food) {
        val intent = Intent(this, FoodDetailActivity::class.java)
        intent.putExtra("food", food)
        startActivity(intent)
    }

    // Method untuk meng-generate data makanan contoh
    private fun generateFoodData(): List<Food> {
        val foodList = arrayListOf<Food>()
        foodList.add(Food("Daging Ayam", R.drawable.ayam_rebus, "Daging ayam memiliki beberapa manfaat penting untuk workout atau latihan fisik karena kaya akan nutrisi yang mendukung pertumbuhan otot dan pemulihan tubuh setelah berolahraga. Berikut adalah deskripsi singkat tentang manfaat daging ayam untuk workout:\n" +
                "\n" +
                "Protein tinggi: Daging ayam mengandung protein tinggi, yang merupakan nutrisi kunci untuk membangun dan memperbaiki otot. Protein adalah bahan bangunan otot, dan ketika Anda berlatih, otot Anda akan mengalami kerusakan ringan yang memerlukan protein untuk memperbaikinya dan membantu otot tumbuh lebih besar dan lebih kuat.\n" +
                "\n" +
                "Asam amino esensial: Daging ayam mengandung semua sembilan asam amino esensial, yang diperlukan tubuh karena tidak dapat diproduksi sendiri. Asam amino ini berperan penting dalam proses pemulihan dan regenerasi otot setelah latihan.\n" +
                "\n" +
                "Rendah lemak jenuh: Daging ayam, terutama bagian daging tanpa kulit, memiliki kandungan lemak jenuh yang rendah. Ini bermanfaat karena lemak jenuh berlebih dapat mempengaruhi performa olahraga dan kesehatan jantung.\n" +
                "\n" +
                "Kaya zat besi: Daging ayam mengandung zat besi, yang membantu tubuh membawa oksigen ke sel-sel otot. Oksigen yang cukup dalam otot penting untuk meningkatkan daya tahan selama latihan.\n" +
                "\n" +
                "Sumber energi: Daging ayam mengandung vitamin B kompleks, seperti vitamin B6 dan niacin, yang membantu tubuh mengubah makanan menjadi energi. Energi yang cukup diperlukan untuk menjalankan latihan dengan optimal.\n" +
                "\n" +
                "Membantu penurunan berat badan: Daging ayam rendah kalori dan tinggi protein, sehingga dapat membantu dalam program penurunan berat badan. Protein membantu mengurangi rasa lapar dan meningkatkan rasa kenyang, sehingga Anda cenderung mengonsumsi lebih sedikit kalori secara keseluruhan.\n" +
                "\n" +
                "Meningkatkan massa otot: Daging ayam adalah sumber protein hewani yang baik, dan konsumsi protein yang memadai berperan penting dalam meningkatkan massa otot. Semakin banyak otot yang Anda miliki, semakin tinggi pula metabolisme tubuh Anda, yang dapat membantu dalam membakar lemak lebih efisien.\n" +
                "\n" +
                "Namun, penting untuk diingat bahwa manfaat daging ayam untuk workout akan lebih efektif jika diimbangi dengan latihan yang teratur, pola makan yang seimbang, istirahat yang cukup, dan gaya hidup sehat secara keseluruhan. Selalu konsultasikan dengan ahli gizi atau pelatih fisik jika Anda memiliki pertanyaan lebih lanjut tentang diet dan program latihan yang sesuai untuk Anda."))
        foodList.add(Food("Daging Sapi", R.drawable.daging_sapi, "Daging sapi memiliki beberapa manfaat penting untuk workout atau latihan fisik karena kaya akan nutrisi yang mendukung pertumbuhan otot, pemulihan tubuh, dan kinerja olahraga secara keseluruhan. Berikut adalah deskripsi singkat tentang manfaat daging sapi untuk workout:\n" +
                "\n" +
                "1. Protein tinggi: Daging sapi adalah sumber protein hewani yang kaya, yang sangat penting untuk membangun dan memperbaiki otot setelah latihan. Protein berfungsi sebagai bahan bangunan otot dan membantu dalam proses pemulihan otot setelah aktivitas fisik yang intens.\n" +
                "\n" +
                "2. Asam amino esensial: Daging sapi mengandung semua sembilan asam amino esensial yang diperlukan oleh tubuh. Asam amino ini berperan penting dalam sintesis protein, pemulihan otot, dan menjaga kesehatan jaringan tubuh.\n" +
                "\n" +
                "3. Zat besi: Daging sapi mengandung zat besi, yang membantu dalam membawa oksigen ke sel-sel otot. Oksigen yang cukup dalam otot memungkinkan Anda memiliki daya tahan yang lebih baik selama latihan dan membantu mencegah kelelahan berlebihan.\n" +
                "\n" +
                "4. Kreatin: Daging sapi adalah sumber alami kreatin, senyawa yang menyediakan energi cepat untuk aktivitas berat dan intens, seperti latihan beban. Kreatin dapat meningkatkan performa selama latihan jangka pendek dan membantu meningkatkan massa otot.\n" +
                "\n" +
                "5. Sumber energi: Daging sapi mengandung vitamin B kompleks, seperti vitamin B12 dan B6, yang membantu tubuh mengubah makanan menjadi energi. Energi yang cukup diperlukan untuk menjalankan latihan dengan optimal.\n" +
                "\n" +
                "6. Rendah karbohidrat: Daging sapi memiliki kandungan karbohidrat yang rendah, sehingga cocok sebagai pilihan makanan bagi mereka yang mengikuti diet rendah karbohidrat atau diet tinggi protein.\n" +
                "\n" +
                "Penting untuk mencatat bahwa manfaat daging sapi untuk workout akan lebih efektif jika diimbangi dengan latihan yang teratur, asupan nutrisi yang seimbang, dan istirahat yang cukup. Selalu konsultasikan dengan ahli gizi atau pelatih fisik jika Anda memiliki pertanyaan lebih lanjut tentang diet dan program latihan yang sesuai untuk Anda."))
        foodList.add(Food("Telur", R.drawable.telur_rebus, "Telur adalah sumber makanan yang sangat baik dan bermanfaat untuk workout atau latihan fisik. Berikut adalah deskripsi singkat tentang manfaat telur untuk workout:\n" +
                "\n" +
                "1. Protein berkualitas tinggi: Telur adalah salah satu sumber protein berkualitas tinggi yang alami dan lengkap. Protein ini mengandung semua asam amino esensial yang diperlukan oleh tubuh untuk membangun dan memperbaiki otot setelah berolahraga. Konsumsi telur dapat membantu meningkatkan sintesis protein dan pemulihan otot setelah latihan.\n" +
                "\n" +
                "2. Kandungan lemak sehat: Telur mengandung lemak sehat, terutama dalam kuning telur. Lemak sehat penting untuk penyerapan vitamin dan mineral, termasuk vitamin A, D, E, dan K. Lemak juga berperan dalam membantu tubuh menggunakan energi dengan efisien selama aktivitas fisik.\n" +
                "\n" +
                "3. Vitamin dan mineral esensial: Telur mengandung sejumlah besar vitamin dan mineral penting, termasuk vitamin B kompleks (B2, B5, B12), vitamin D, selenium, zat besi, fosfor, dan zink. Vitamin dan mineral ini berkontribusi pada fungsi otot, kesehatan tulang, dan dukungan sistem kekebalan tubuh, yang penting untuk menjaga performa olahraga yang optimal.\n" +
                "\n" +
                "4. Kolin: Telur juga merupakan salah satu sumber terbaik kolin, yaitu nutrisi yang penting untuk kesehatan otak dan fungsi saraf. Kolin membantu meningkatkan neurotransmitter yang berperan dalam konsentrasi dan kognisi, sehingga dapat membantu fokus dan kinerja saat berlatih.\n" +
                "\n" +
                "5. Sumber energi: Telur menyediakan energi dalam bentuk kalori yang diperlukan untuk menjalankan latihan dan mempertahankan aktivitas fisik. Telur merupakan makanan yang sederhana dan mudah dicerna, sehingga memberikan sumber energi yang cepat dan efisien.\n" +
                "\n" +
                "Dalam rangka mendapatkan manfaat maksimal dari telur untuk workout, sebaiknya dikonsumsi dalam kombinasi dengan diet seimbang dan gaya hidup aktif. Penting juga untuk mengonsumsi telur dengan metode masak yang sehat, seperti merebus, mengukus, atau membuat telur mata sapi, untuk menjaga kandungan nutrisinya. Jangan ragu untuk berkonsultasi dengan ahli gizi jika Anda memiliki pertanyaan lebih lanjut tentang bagaimana mengintegrasikan telur ke dalam rencana makan sehat Anda."))
        foodList.add(Food("Buah", R.drawable.buah, "Buah-buahan adalah sumber nutrisi yang sangat berharga untuk workout atau latihan fisik. Berikut adalah deskripsi singkat tentang manfaat buah untuk workout:\n" +
                "\n" +
                "1. Sumber energi: Buah-buahan mengandung karbohidrat, yang merupakan sumber utama energi untuk tubuh. Karbohidrat di dalam buah memberikan energi yang dibutuhkan untuk latihan, membantu meningkatkan daya tahan selama aktivitas fisik, dan mengisi kembali glikogen yang hilang selama latihan.\n" +
                "\n" +
                "2. Vitamin dan mineral: Buah-buahan kaya akan berbagai vitamin dan mineral esensial, seperti vitamin C, vitamin A, kalium, dan magnesium. Vitamin dan mineral ini berperan penting dalam mendukung kesehatan tubuh secara keseluruhan dan membantu menjaga kinerja optimal saat berolahraga.\n" +
                "\n" +
                "3. Serat: Buah-buahan mengandung serat makanan, yang penting untuk pencernaan yang sehat. Serat membantu mengatur penyerapan nutrisi, menjaga perut kenyang lebih lama, dan mendukung metabolisme tubuh.\n" +
                "\n" +
                "4. Antioksidan: Banyak buah-buahan mengandung antioksidan, seperti vitamin C dan vitamin E, yang membantu melindungi sel-sel tubuh dari kerusakan akibat radikal bebas. Latihan fisik yang intens dapat menyebabkan stres oksidatif, dan antioksidan dalam buah membantu mengurangi efek negatifnya.\n" +
                "\n" +
                "5. Hidrasi: Sebagian besar buah-buahan memiliki kandungan air yang tinggi, membantu menjaga tubuh tetap terhidrasi selama workout. Hidrasi yang adekuat sangat penting untuk menjaga kinerja olahraga yang baik dan mencegah risiko dehidrasi.\n" +
                "\n" +
                "6. Snack sehat: Buah-buahan adalah pilihan snack yang sehat dan mudah untuk dibawa ke mana pun. Makan buah sebelum atau setelah latihan dapat memberikan energi cepat dan membantu pemulihan otot.\n" +
                "\n" +
                "Penting untuk mencatat bahwa buah-buahan harus menjadi bagian dari diet seimbang dan variasi yang mencakup berbagai macam nutrisi. Konsumsi buah secara teratur dapat memberikan manfaat besar bagi tubuh Anda dan mendukung kinerja Anda dalam latihan atau olahraga apa pun. Jangan lupa untuk memadukan buah dengan sumber protein dan sumber karbohidrat lainnya untuk mendapatkan manfaat yang lebih maksimal. Selalu konsultasikan dengan ahli gizi jika Anda memiliki pertanyaan lebih lanjut tentang diet yang sesuai untuk tujuan dan kebutuhan olahraga Anda."))
        foodList.add(Food("Sayuran", R.drawable.sayuran, "Sayuran merupakan bagian penting dari diet untuk workout atau latihan fisik karena kaya akan nutrisi dan manfaat kesehatan. Berikut adalah deskripsi singkat tentang manfaat sayuran untuk workout:\n" +
                "\n" +
                "1. Kandungan serat: Sayuran mengandung serat makanan yang penting untuk pencernaan yang sehat. Serat membantu menjaga perut kenyang lebih lama, mengatur penyerapan nutrisi, dan membantu menjaga berat badan yang sehat.\n" +
                "\n" +
                "2. Vitamin dan mineral: Sayuran kaya akan berbagai vitamin dan mineral, seperti vitamin C, vitamin A, vitamin K, folat, kalium, dan magnesium. Vitamin dan mineral ini mendukung kesehatan tulang, fungsi otot, sistem kekebalan tubuh, dan proses pemulihan tubuh setelah berlatih.\n" +
                "\n" +
                "3. Antioksidan: Banyak sayuran mengandung senyawa antioksidan, seperti beta-karoten, lutein, dan likopen, yang membantu melawan kerusakan radikal bebas dan menjaga kesehatan sel-sel tubuh. Latihan fisik yang intens dapat menyebabkan stres oksidatif, dan antioksidan dalam sayuran membantu mengurangi dampak negatifnya.\n" +
                "\n" +
                "4. Hidrasi: Beberapa sayuran memiliki kandungan air yang tinggi, seperti mentimun dan selada, yang membantu menjaga tubuh terhidrasi selama workout. Hidrasi yang baik sangat penting untuk menjaga kinerja olahraga yang optimal dan mencegah dehidrasi.\n" +
                "\n" +
                "5. Kalori rendah: Banyak sayuran memiliki kandungan kalori yang rendah, membuatnya menjadi pilihan makanan yang ideal untuk menjaga berat badan atau program penurunan berat badan yang sehat.\n" +
                "\n" +
                "6. Penyedia energi: Meskipun sayuran tidak mengandung karbohidrat dalam jumlah besar seperti biji-bijian atau buah-buahan, mereka tetap memberikan energi penting yang diperlukan untuk mendukung aktivitas fisik.\n" +
                "\n" +
                "7. Snack sehat: Sayuran bisa dijadikan pilihan snack sehat yang mudah dibawa dan dikonsumsi sebelum atau sesudah latihan, memberikan nutrisi dan energi yang diperlukan untuk performa olahraga yang baik.\n" +
                "\n" +
                "Dalam rangka mendapatkan manfaat maksimal dari sayuran untuk workout, pastikan untuk mengonsumsi beragam jenis sayuran dengan berbagai warna dan varietas, karena setiap jenis sayuran memberikan manfaat yang unik bagi tubuh Anda. Integrasikan sayuran dalam rencana makan sehat Anda, dan jangan ragu untuk berkonsultasi dengan ahli gizi jika Anda memiliki pertanyaan lebih lanjut tentang diet yang sesuai dengan tujuan dan kebutuhan olahraga Anda."))
        return foodList
    }

}