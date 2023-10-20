package org.d3if2029.homeworkout.dbcewek

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entitycewek.ExerciseModelCewek


class ExercisesCewek {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModelCewek>{
            var exercisesList = ArrayList<ExerciseModelCewek>()

            val lunge = ExerciseModelCewek(1,
                "Lunges",
                R.drawable.lungescewek,
                "Lunges adalah latihan dengan langkah maju atau mundur menggunakan satu kaki sambil menekuk kedua lutut sehingga membentuk sudut 90 derajat. Mulailah dengan berdiri tegak, lalu langkahkan kaki kanan ke depan atau belakang, tekuk kedua lutut hingga membentuk sudut 90 derajat, dan pastikan lutut belakang hampir menyentuh lantai. Dorong kembali ke posisi berdiri. ",
                "https://www.youtube.com/watch?v=2yZ4hjE4WbE&pp=ygUWdmlkZW8gY2FyYSBMdW5nZXNjZXdlaw%3D%3D",
                false,
                false)
            exercisesList.add(lunge)

            val sidePlank = ExerciseModelCewek(2,
                "Side Plank",
                R.drawable.sideplankcewek,
                "Side plank adalah latihan yang melibatkan berbaring telentang dengan tubuh ditopang oleh satu lengan yang ditekuk, siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dengan posisi tubuh memiring ke samping. Tahan posisi ini dengan satu tangan dan sisi kaki yang bersentuhan dengan lantai.",
                "https://youtube.com/shorts/3BQ9UtCZVHY?si=1naTlUuEGButbQZ4",
                false,
                false)
            exercisesList.add(sidePlank)

            val pushUpAndRotation = ExerciseModelCewek(3,
                "Push ups And Rotation",
                R.drawable.pushuprotationcewek,
                "Push-ups and rotation adalah latihan yang dimulai dengan posisi push-up tradisional. Setelah melakukan satu push-up, rotasi tubuh ke sisi kiri atau kanan dengan mengangkat satu lengan ke atas dan memutar tubuh ke arah yang sama. Tubuh membentuk garis lurus dari kepala hingga kaki.",
                "https://youtube.com/shorts/3F_hvtJYqAI?si=a79Gaj9uEkN9CT7o",
                false,
                false)
            exercisesList.add(pushUpAndRotation)

            val highKnees = ExerciseModelCewek(4,
                "High Knees Running In Place",
                R.drawable.highkneescewek,
                "High knees running in place adalah latihan yang melibatkan berlari diam di tempat sambil mengangkat lutut setinggi mungkin secara bergantian. Berdiri tegak, mulailah mengangkat lutut kanan setinggi pinggang sambil berlari di tempat, lalu ganti dengan lutut kiri.",
                "https://youtube.com/shorts/IdIlyOKozx4?si=pNBGB-VfwxgfHBel",
                false,
                false)
            exercisesList.add(highKnees)

            val plank = ExerciseModelCewek(5,
                "Plank",
                R.drawable.plankcewek,
                "Plank adalah latihan di mana Anda berbaring telentang dengan berat tubuh ditopang oleh lengan yang ditekuk, dengan siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dan Anda harus menjaga inti tubuh terasa tegang. ",
                "https://youtube.com/shorts/3BQ9UtCZVHY?si=7PboUkfZQaB8UBUN",
                false,
                false)
            exercisesList.add(plank)

            val tricepsDip = ExerciseModelCewek(6,
                "Triceps Dip On Chair",
                R.drawable.tricepdiponchaircewek,
                "Triceps dip on chair adalah latihan yang dilakukan dengan duduk di kursi, tangan memegang pinggiran kursi di samping pinggul, kaki ditekuk dengan telapak kaki rata di lantai. Geser pinggul keluar dari kursi, lalu tekuk siku hingga tubuh turun ke bawah, dan dorong kembali tubuh ke atas hingga siku lurus. Latihan ini melibatkan otot trisep dan bisa membantu menguatkan lengan bagian belakang.",
                "https://youtu.be/6kALZikXxLc?si=iFQsJ7DqOY_4jJ1h",
                false,
                false)
            exercisesList.add(tricepsDip)

            val stepUp = ExerciseModelCewek(7,
                "Step-Up Onto Chair",
                R.drawable.stepupontochair,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                "https://youtu.be/aajhW7DD1EA?si=Kx9BibU95_H4Gg4U",
                false,
                false)
            exercisesList.add(stepUp)

            val squat = ExerciseModelCewek(8,
                "Squat",
                R.drawable.squatcewek,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                "https://youtu.be/-cdph8hv0O0?si=B9FTv7JJyXD8L5ay",
                false,
                false)
            exercisesList.add(squat)



            val wallSit = ExerciseModelCewek(9,
                "Wall Sit",
                R.drawable.wallsitcewek,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                "https://youtube.com/shorts/wkgTWgkaWxM?si=7eHxnHHe3ls2xBop",
                false,
                false)
            exercisesList.add(wallSit)

            val jumpingJacks = ExerciseModelCewek(10,
                "Jumping Jacks",
                R.drawable.jumpingjackcewek,
                "Jumping jack adalah gerakan aerobik dengan melompat sambil membuka dan menutup kaki serta angkat lengan di atas kepala. Berdiri tegak, buka kaki dan angkat lengan pada hitungan satu, lalu kembali ke posisi awal pada hitungan dua. Lakukan gerakan ini secara berulang dengan ritme cepat untuk melatih kardiovaskular dan meningkatkan stamina.",
                "https://youtube.com/shorts/yg3KQQn3QWg?si=KeYBPUAa9-jvZqKP",
                false,
                false)
            exercisesList.add(jumpingJacks)

            val abCrunch = ExerciseModelCewek(11,
                "Abdominal crunch",
                R.drawable.abdonimalcrunchcewek,
                "Abdominal Crunch adalah latihan yang melibatkan berbaring telentang dengan lutut ditekuk dan telapak kaki rata di lantai. Letakkan tangan di belakang kepala dengan jari-jari terentang. Kemudian, angkat bahu Anda dari lantai dengan menggunakan otot perut, tanpa mengangkat seluruh punggung. Turunkan kembali dengan kendali untuk satu repetisi. Latihan ini bertujuan mengencangkan otot perut bagian atas.",
                "https://youtu.be/xBPQ1Es6qgU?si=l2w0XP15YSmdhgEU",
                false,
                false)
            exercisesList.add(abCrunch)


            val pushUp = ExerciseModelCewek(12,
                "Push Ups",
                R.drawable.pushupcewek,
                "Push-up dilakukan dengan posisi tubuh telentang di lantai dan tangan diletakkan sedikit lebih lebar dari bahu. Tekuk siku untuk menurunkan tubuh ke dekat lantai, lalu dorong tubuh kembali ke atas menggunakan lengan. Latihan ini kuat untuk menguatkan otot dada, lengan, dan inti tubuh.",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(pushUp)

            return exercisesList
        }
    }
}