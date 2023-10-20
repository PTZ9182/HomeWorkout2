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
        foodList.add(Food("Daging Ayam", R.drawable.ayam_rebus, "Daging ayam adalah sumber protein yang baik untuk workout atau latihan fisik karena memiliki beberapa manfaat utama:\n" +
                "\n" +
                "Sumber Protein Berkualitas Tinggi: Daging ayam kaya akan protein berkualitas tinggi yang penting untuk membangun dan memperbaiki otot setelah latihan.\n" +
                "\n" +
                "Rendah Lemak Jenuh: Daging ayam cenderung rendah lemak jenuh, sehingga cocok untuk mendukung program diet yang sehat dan pembentukan otot.\n" +
                "\n" +
                "Kaya akan Nutrisi: Selain protein, daging ayam mengandung berbagai nutrisi seperti zat besi, zinc, dan vitamin B yang mendukung kesehatan tubuh secara keseluruhan.\n" +
                "\n" +
                "Mudah Dimasak: Daging ayam dapat dimasak dengan berbagai cara, seperti dipanggang, direbus, atau digrill, sehingga mudah diintegrasikan dalam menu makanan sehari-hari.\n" +
                "\n" +
                "Cara penggunaannya dalam diet workout singkat:\n" +
                "\n" +
                "Protein Post-Workout: Setelah latihan, konsumsi daging ayam sebagai bagian dari makanan pos-latihan Anda untuk membantu pemulihan otot dan pertumbuhan.\n" +
                "\n" +
                "Pilih Bagian Tanpa Kulit: Hindari bagian kulit karena mengandung lebih banyak lemak. Pilih daging ayam tanpa kulit untuk asupan protein yang lebih sehat.\n" +
                "\n" +
                "Kombinasikan dengan Karbohidrat dan Sayuran: Untuk makanan seimbang, sajikan daging ayam dengan karbohidrat kompleks seperti nasi merah atau quinoa, serta sayuran segar.\n" +
                "\n" +
                "Porsi yang Seimbang: Pastikan untuk mengontrol porsi Anda sesuai dengan kebutuhan tubuh dan tujuan workout Anda.\n" +
                "\n" +
                "Porsi makanan kalori dari daging ayam per hari untuk workout akan sangat bervariasi tergantung pada tujuan Anda, tingkat aktivitas fisik, dan asupan kalori keseluruhan. Namun, sebagai panduan singkat:\n" +
                "\n" +
                "Tujuan Meningkatkan Massa Otot: Jika tujuan Anda adalah meningkatkan massa otot, Anda mungkin perlu lebih banyak kalori. Porsi makanan daging ayam sekitar 4-6 ons (113-170 gram) per hari bisa cocok. Pastikan untuk mendapatkan cukup protein dari daging ayam untuk mendukung pertumbuhan otot.\n" +
                "\n" +
                "Tujuan Penurunan Berat Badan: Jika Anda sedang mencoba menurunkan berat badan sambil tetap melakukan workout, porsi daging ayam sekitar 3-4 ons (85-113 gram) per hari bisa sesuai. Hindari menggoreng daging ayam dan fokus pada metode memasak yang lebih sehat seperti panggang atau rebus."))
        foodList.add(Food("Daging Sapi", R.drawable.daging_sapi, "Daging sapi juga memiliki sejumlah manfaat bagi program workout atau latihan fisik. Berikut adalah beberapa manfaatnya dan cara penggunaannya secara singkat:\n" +
                "\n" +
                "Manfaat Daging Sapi untuk Workout:\n" +
                "\n" +
                "Sumber Protein dan Zat Besi: Daging sapi mengandung protein berkualitas tinggi yang membantu dalam pemulihan dan pembentukan otot, serta zat besi yang mendukung transportasi oksigen ke sel-sel tubuh.\n" +
                "\n" +
                "Kaya Amino Asam: Daging sapi kaya akan asam amino penting seperti leusin, isoleusin, dan valin, yang mendukung sintesis protein otot.\n" +
                "\n" +
                "Sumber Kreatin: Daging sapi mengandung kreatin alami yang dapat meningkatkan daya tahan dan kinerja saat latihan berat.\n" +
                "\n" +
                "Penting untuk Pertumbuhan Otot: Protein dan nutrisi dalam daging sapi membantu dalam pembentukan dan pemeliharaan otot, yang penting bagi mereka yang ingin membangun massa otot.\n" +
                "\n" +
                "Cara Penggunaan Daging Sapi untuk Workout secara Singkat:\n" +
                "\n" +
                "Pilih Potongan yang Rendah Lemak: Pilih potongan daging sapi yang rendah lemak seperti sirloin, tenderloin, atau daging tanpa lemak untuk menghindari kelebihan kalori.\n" +
                "\n" +
                "Panggang atau Grill: Memasak daging sapi dengan metode pemanggangan atau penggorengan dengan sedikit minyak adalah cara sehat untuk memasaknya.\n" +
                "\n" +
                "Kombinasikan dengan Karbohidrat: Sajikan dengan karbohidrat kompleks seperti kentang atau beras merah untuk memberikan energi tambahan.\n" +
                "\n" +
                "Perhatikan Porsi: Kontrol porsi Anda untuk menghindari asupan kalori berlebihan. Porsi yang seimbang adalah kunci.\n" +
                "\n" +
                "Sertakan Sayuran: Tambahkan sayuran hijau atau berwarna-warni untuk memastikan asupan nutrisi yang seimbang.\n" +
                "\n" +
                "Porsi makanan kalori dari daging sapi per hari untuk workout akan sangat bervariasi tergantung pada tujuan Anda, tingkat aktivitas fisik, dan asupan kalori keseluruhan. Berikut adalah panduan singkat:\n" +
                "\n" +
                "Tujuan Meningkatkan Massa Otot: Jika Anda ingin meningkatkan massa otot, Anda mungkin memerlukan lebih banyak kalori. Porsi makan daging sapi sekitar 4-6 ons (113-170 gram) per hari bisa sesuai. Pastikan porsi tersebut memberikan asupan protein yang mencukupi untuk mendukung pertumbuhan otot.\n" +
                "\n" +
                "Tujuan Penurunan Berat Badan: Jika Anda sedang berusaha menurunkan berat badan sambil tetap menjalani workout, porsi daging sapi sekitar 3-4 ons (85-113 gram) per hari bisa cukup. Pilih potongan daging sapi yang lebih rendah lemak dan hindari penggunaan minyak berlebihan saat memasak."))
        foodList.add(Food("Telur", R.drawable.telur_rebus, "Telur adalah sumber nutrisi yang baik untuk mendukung program workout atau latihan fisik dengan berbagai manfaat, dan berikut adalah beberapa manfaatnya serta cara penggunaannya secara singkat:\n" +
                "\n" +
                "Manfaat Telur untuk Workout:\n" +
                "\n" +
                "Sumber Protein Berkualitas Tinggi: Telur mengandung protein berkualitas tinggi yang penting untuk pemulihan dan pembentukan otot.\n" +
                "\n" +
                "Kaya Amino Asam: Telur mengandung berbagai asam amino esensial yang mendukung pertumbuhan otot dan pemulihan tubuh setelah latihan.\n" +
                "\n" +
                "Kolin: Kandungan kolin dalam telur membantu dalam fungsi otak dan sistem saraf, yang dapat meningkatkan fokus dan konsentrasi selama latihan.\n" +
                "\n" +
                "Vitamin dan Mineral: Telur juga mengandung vitamin dan mineral seperti vitamin D, B kompleks, seng, dan selenium yang mendukung kesehatan umum dan sistem kekebalan tubuh.\n" +
                "\n" +
                "Cara Penggunaan Telur untuk Workout secara Singkat:\n" +
                "\n" +
                "Konsumsi Telur Sebagai Bagian dari Sarapan: Telur bisa dimasak menjadi berbagai hidangan sarapan seperti telur dadar atau rebus. Ini memberikan asupan protein yang baik untuk memulai hari dan memberikan energi untuk latihan.\n" +
                "\n" +
                "Gabungkan dengan Karbohidrat: Sertakan karbohidrat seperti roti gandum atau oatmeal untuk makanan yang seimbang sebelum latihan.\n" +
                "\n" +
                "Telur Rebus sebagai Camilan: Telur rebus adalah camilan yang sehat dan praktis untuk mendapatkan protein tambahan selama hari, terutama jika Anda memiliki latihan sore atau malam.\n" +
                "\n" +
                "Telur sebagai Bahan Makanan: Anda juga dapat mengintegrasikan telur ke dalam hidangan seperti salad, sandwich, atau wrap untuk meningkatkan nilai gizinya.\n" +
                "\n" +
                "Kendalikan Konsumsi Kuning Telur: Kuning telur mengandung lemak dan kolesterol lebih tinggi, jadi konsumsilah dengan bijak sesuai dengan kebutuhan kalori dan lemak Anda.\n " +
                "\n" +
                "Porsi makanan kalori telur rebus per hari untuk workout akan sangat bervariasi tergantung pada tujuan Anda, tingkat aktivitas fisik, dan asupan kalori keseluruhan. Berikut adalah panduan singkat:\n" +
                "\n" +
                "Tujuan Meningkatkan Massa Otot: Jika Anda ingin meningkatkan massa otot, telur rebus bisa menjadi sumber protein yang baik. Konsumsi sekitar 2-4 telur rebus per hari dapat memberikan asupan protein yang cukup untuk mendukung pertumbuhan otot.\n" +
                "\n" +
                "Tujuan Penurunan Berat Badan: Jika Anda sedang berusaha menurunkan berat badan sambil menjalani workout, porsi telur rebus sekitar 1-2 telur per hari bisa cukup. Namun, perhatikan total asupan kalori harian Anda."))
        foodList.add(Food("Buah", R.drawable.buah, "Buah-buahan adalah sumber nutrisi penting yang dapat memberikan banyak manfaat saat digunakan dalam program workout. Berikut adalah beberapa manfaat buah-buahan dan cara penggunaannya secara singkat:\n" +
                "\n" +
                "Manfaat Buah-buahan untuk Workout:\n" +
                "\n" +
                "Sumber Energi: Buah-buahan mengandung karbohidrat yang memberikan energi yang diperlukan untuk latihan dan membantu mencegah kelelahan.\n" +
                "\n" +
                "Serat yang Baik: Serat dalam buah-buahan mendukung pencernaan yang sehat dan menjaga perasaan kenyang selama latihan.\n" +
                "\n" +
                "Vitamin dan Antioksidan: Buah-buahan kaya akan vitamin, mineral, dan antioksidan yang mendukung sistem kekebalan tubuh dan pemulihan setelah latihan.\n" +
                "\n" +
                "Hidrasi: Buah-buahan yang mengandung banyak air, seperti semangka, dapat membantu menjaga hidrasi selama latihan.\n" +
                "\n" +
                "Cara Penggunaan Buah-buahan untuk Workout secara Singkat:\n" +
                "\n" +
                "Konsumsi Sebelum Latihan: Makan buah-buahan seperti pisang atau apel sekitar 30-60 menit sebelum latihan untuk memberikan energi cepat.\n" +
                "\n" +
                "Setelah Latihan: Buah-buahan bisa menjadi pilihan camilan pasca-latihan yang sehat untuk memulihkan glikogen otot dan menyediakan nutrisi yang diperlukan.\n" +
                "\n" +
                "Dalam Smoothie: Buah-buahan bisa dicampur dalam smoothie dengan protein (misalnya, yogurt atau whey protein) untuk makanan setelah latihan yang lengkap.\n" +
                "\n" +
                "Cemilan Sehat: Buah-buahan seperti buah-buahan berry atau potongan buah segar bisa dijadikan cemilan sehat sepanjang hari.\n" +
                "\n" +
                "Perhatikan Asupan Gula: Meskipun buah-buahan mengandung gula alami, tetaplah membatasi konsumsi dalam jumlah berlebihan untuk menghindari asupan kalori berlebihan.\n" +
                "\n" +
                "Porsi makanan buah berkalori per hari untuk workout akan sangat bervariasi tergantung pada tujuan Anda, tingkat aktivitas fisik, dan asupan kalori keseluruhan. Berikut adalah panduan singkat:\n" +
                "\n" +
                "Tujuan Meningkatkan Massa Otot: Jika Anda ingin meningkatkan massa otot, asupan buah yang mengandung kalori seperti pisang atau apel dapat memberikan energi tambahan. Konsumsi 1-2 porsi buah per hari bisa sesuai.\n" +
                "\n" +
                "Tujuan Penurunan Berat Badan: Jika Anda sedang berusaha menurunkan berat badan sambil tetap menjalani workout, porsi buah sekitar 2-3 porsi per hari bisa sesuai. Pilih buah dengan kandungan gula yang lebih rendah seperti beri atau stroberi."))
        foodList.add(Food("Sayuran", R.drawable.sayuran, "Sayuran adalah komponen penting dalam diet yang dapat memberikan manfaat berikut saat digunakan dalam program workout:\n" +
                "\n" +
                "Manfaat Sayuran untuk Workout:\n" +
                "\n" +
                "Serat Tinggi: Sayuran mengandung serat tinggi yang membantu menjaga pencernaan yang sehat, memperlambat penyerapan karbohidrat, dan memberikan perasaan kenyang.\n" +
                "\n" +
                "Vitamin dan Mineral: Sayuran kaya akan berbagai vitamin dan mineral seperti vitamin C, K, kalium, dan magnesium yang mendukung kesehatan tulang, otot, dan sistem kekebalan tubuh.\n" +
                "\n" +
                "Antioksidan: Antioksidan dalam sayuran membantu melindungi sel-sel tubuh dari kerusakan oksidatif yang dapat terjadi selama latihan berat.\n" +
                "\n" +
                "Hidrasi: Sayuran seperti mentimun dan selada mengandung banyak air, membantu menjaga hidrasi selama latihan.\n" +
                "\n" +
                "Cara Penggunaan Sayuran untuk Workout secara Singkat:\n" +
                "\n" +
                "Konsumsi dalam Setiap Makan: Sertakan sayuran dalam setiap hidangan makanan Anda, baik sebagai hidangan utama atau sebagai pelengkap.\n" +
                "\n" +
                "Sayuran Sebagai Camilan: Sayuran seperti wortel atau brokoli dapat diiris dan dijadikan camilan sehat di antara waktu makan.\n" +
                "\n" +
                "Tambahkan ke Smoothie: Beberapa sayuran, seperti bayam atau kale, dapat dicampur dalam smoothie untuk asupan nutrisi yang lebih tinggi.\n" +
                "\n" +
                "Salad Sebagai Hidangan Utama: Sajikan salad yang kaya sayuran sebagai hidangan utama dengan tambahan protein seperti daging ayam atau ikan.\n" +
                "\n" +
                "Variasi Warna: Cobalah berbagai jenis sayuran berwarna-warni untuk mendapatkan manfaat nutrisi yang beragam."))
        return foodList
    }

}