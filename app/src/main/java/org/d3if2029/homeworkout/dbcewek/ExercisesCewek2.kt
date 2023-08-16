package org.d3if2029.homeworkout.dbcewek

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entitycewek.ExerciseModelCewek2


class ExercisesCewek2 {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModelCewek2>{
            var exercisesList = ArrayList<ExerciseModelCewek2>()

            val lunge = ExerciseModelCewek2(1,
                "Lunges",
                R.drawable.lungescewek,
                "Lunges adalah latihan dengan langkah maju atau mundur menggunakan satu kaki sambil menekuk kedua lutut sehingga membentuk sudut 90 derajat. Mulailah dengan berdiri tegak, lalu langkahkan kaki kanan ke depan atau belakang, tekuk kedua lutut hingga membentuk sudut 90 derajat, dan pastikan lutut belakang hampir menyentuh lantai. Dorong kembali ke posisi berdiri. ",
                false,
                false)
            exercisesList.add(lunge)

            val sidePlank = ExerciseModelCewek2(2,
                "Side Plank",
                R.drawable.sideplankcewek,
                "Side plank adalah latihan yang melibatkan berbaring telentang dengan tubuh ditopang oleh satu lengan yang ditekuk, siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dengan posisi tubuh memiring ke samping. Tahan posisi ini dengan satu tangan dan sisi kaki yang bersentuhan dengan lantai.",
                false,
                false)
            exercisesList.add(sidePlank)

            val pushUpAndRotation = ExerciseModelCewek2(3,
                "Push ups And Rotation",
                R.drawable.pushuprotationcewek,
                "Push-ups and rotation adalah latihan yang dimulai dengan posisi push-up tradisional. Setelah melakukan satu push-up, rotasi tubuh ke sisi kiri atau kanan dengan mengangkat satu lengan ke atas dan memutar tubuh ke arah yang sama. Tubuh membentuk garis lurus dari kepala hingga kaki.",
                false,
                false)
            exercisesList.add(pushUpAndRotation)

            val highKnees = ExerciseModelCewek2(4,
                "High Knees Running In Place",
                R.drawable.highkneescewek,
                "High knees running in place adalah latihan yang melibatkan berlari diam di tempat sambil mengangkat lutut setinggi mungkin secara bergantian. Berdiri tegak, mulailah mengangkat lutut kanan setinggi pinggang sambil berlari di tempat, lalu ganti dengan lutut kiri.",
                false,
                false)
            exercisesList.add(highKnees)

            val plank = ExerciseModelCewek2(5,
                "Plank",
                R.drawable.plankcewek,
                "Plank adalah latihan di mana Anda berbaring telentang dengan berat tubuh ditopang oleh lengan yang ditekuk, dengan siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dan Anda harus menjaga inti tubuh terasa tegang. ",
                false,
                false)
            exercisesList.add(plank)

            val tricepsDip = ExerciseModelCewek2(6,
                "Triceps Dip On Chair",
                R.drawable.tricepdiponchaircewek,
                "Triceps dip on chair adalah latihan yang dilakukan dengan duduk di kursi, tangan memegang pinggiran kursi di samping pinggul, kaki ditekuk dengan telapak kaki rata di lantai. Geser pinggul keluar dari kursi, lalu tekuk siku hingga tubuh turun ke bawah, dan dorong kembali tubuh ke atas hingga siku lurus. Latihan ini melibatkan otot trisep dan bisa membantu menguatkan lengan bagian belakang.",
                false,
                false)
            exercisesList.add(tricepsDip)

            val stepUp = ExerciseModelCewek2(7,
                "Step-Up Onto Chair",
                R.drawable.stepupontochair,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                false,
                false)
            exercisesList.add(stepUp)

            val squat = ExerciseModelCewek2(8,
                "Squat",
                R.drawable.squatcewek,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                false,
                false)
            exercisesList.add(squat)



            val wallSit = ExerciseModelCewek2(9,
                "Wall Sit",
                R.drawable.wallsitcewek,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                false,
                false)
            exercisesList.add(wallSit)
            return exercisesList
        }
    }
}