package org.d3if2029.homeworkout.dbcewek

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entitycewek.ExerciseModelCewek3


class ExercisesCewek3 {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModelCewek3>{
            var exercisesList = ArrayList<ExerciseModelCewek3>()

            val lunge = ExerciseModelCewek3(1,
                "Lunges",
                R.drawable.lungescewek,
                "Lunges adalah latihan dengan langkah maju atau mundur menggunakan satu kaki sambil menekuk kedua lutut sehingga membentuk sudut 90 derajat. Mulailah dengan berdiri tegak, lalu langkahkan kaki kanan ke depan atau belakang, tekuk kedua lutut hingga membentuk sudut 90 derajat, dan pastikan lutut belakang hampir menyentuh lantai. Dorong kembali ke posisi berdiri. ",
                "https://www.youtube.com/watch?v=2yZ4hjE4WbE&pp=ygUWdmlkZW8gY2FyYSBMdW5nZXNjZXdlaw%3D%3D",
                false,
                false)
            exercisesList.add(lunge)

            val sidePlank = ExerciseModelCewek3(2,
                "Side Plank",
                R.drawable.sideplankcewek,
                "Side plank adalah latihan yang melibatkan berbaring telentang dengan tubuh ditopang oleh satu lengan yang ditekuk, siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dengan posisi tubuh memiring ke samping. Tahan posisi ini dengan satu tangan dan sisi kaki yang bersentuhan dengan lantai.",
                "https://youtube.com/shorts/3BQ9UtCZVHY?si=1naTlUuEGButbQZ4",
                false,
                false)
            exercisesList.add(sidePlank)

            val pushUpAndRotation = ExerciseModelCewek3(3,
                "Push ups And Rotation",
                R.drawable.pushuprotationcewek,
                "Push-ups and rotation adalah latihan yang dimulai dengan posisi push-up tradisional. Setelah melakukan satu push-up, rotasi tubuh ke sisi kiri atau kanan dengan mengangkat satu lengan ke atas dan memutar tubuh ke arah yang sama. Tubuh membentuk garis lurus dari kepala hingga kaki.",
                "https://youtube.com/shorts/3F_hvtJYqAI?si=a79Gaj9uEkN9CT7o",
                false,
                false)
            exercisesList.add(pushUpAndRotation)

            val highKnees = ExerciseModelCewek3(4,
                "High Knees Running In Place",
                R.drawable.highkneescewek,
                "High knees running in place adalah latihan yang melibatkan berlari diam di tempat sambil mengangkat lutut setinggi mungkin secara bergantian. Berdiri tegak, mulailah mengangkat lutut kanan setinggi pinggang sambil berlari di tempat, lalu ganti dengan lutut kiri.",
                "https://youtube.com/shorts/IdIlyOKozx4?si=pNBGB-VfwxgfHBel",
                false,
                false)
            exercisesList.add(highKnees)

            val plank = ExerciseModelCewek3(5,
                "Plank",
                R.drawable.plankcewek,
                "Plank adalah latihan di mana Anda berbaring telentang dengan berat tubuh ditopang oleh lengan yang ditekuk, dengan siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dan Anda harus menjaga inti tubuh terasa tegang. ",
                "https://youtube.com/shorts/3BQ9UtCZVHY?si=7PboUkfZQaB8UBUN",
                false,
                false)
            exercisesList.add(plank)

            val tricepsDip = ExerciseModelCewek3(6,
                "Triceps Dip On Chair",
                R.drawable.tricepdiponchaircewek,
                "Triceps dip on chair adalah latihan yang dilakukan dengan duduk di kursi, tangan memegang pinggiran kursi di samping pinggul, kaki ditekuk dengan telapak kaki rata di lantai. Geser pinggul keluar dari kursi, lalu tekuk siku hingga tubuh turun ke bawah, dan dorong kembali tubuh ke atas hingga siku lurus. Latihan ini melibatkan otot trisep dan bisa membantu menguatkan lengan bagian belakang.",
                "https://youtu.be/6kALZikXxLc?si=iFQsJ7DqOY_4jJ1h",
                false,
                false)
            exercisesList.add(tricepsDip)
            return exercisesList
        }
    }
}