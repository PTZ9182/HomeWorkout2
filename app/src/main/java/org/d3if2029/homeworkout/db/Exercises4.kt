package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise4Model

class Exercises4 {

    companion object{
        fun defaultExerciseList():ArrayList<Exercise4Model>{
            var exercisesList = ArrayList<Exercise4Model>()

            val PushUp = Exercise4Model(1,
                "Push Up",
                R.drawable.pushupbagianatas,
                "a. Posisi awal : Telungkup di lantai dengan tangan ditempatkan sedikit lebih lebar dari bahu dan kaki lurus, jari-jari menghadap ke depan.\n" +
                        "b. Teknik : Tekan tangan Anda ke lantai untuk mengangkat tubuh, pastikan tubuh lurus dari kepala hingga kaki. Turunkan tubuh dengan ",
                "https://youtu.be/fMKBfvsltAQ?si=iqO_QMWST1dW6cTM",
                false,
                false)
            exercisesList.add(PushUp)

            val PullUp = Exercise4Model(2,
                "Pull Up",
                R.drawable.pullupbagianatas,
                "a. Posisi awal : Pegang palang pull-up dengan tangan lebar atau sesuai variasi yang Anda pilih. Kaki menggantung bebas.\n" +
                        "b. Teknik : Tarik tubuh Anda naik dengan menggunakan otot lengan dan punggung. Turunkan tubuh dengan kendalikan gerakan. ",
                "https://www.youtube.com/shorts/HD3m9qPHguY",
                false,
                false)
            exercisesList.add(PullUp)

            val Dips = Exercise4Model(3,
                "Dips",
                R.drawable.dipsbagianatas,
                "a.Posisi awal : Pegang dua kursi atau bangku kokoh dengan tangan di sisi badan. Kaki ditekuk dan kaki lurus di depan Anda.\n" +
                        "b. Teknik : Turunkan tubuh dengan menekuk siku hingga lengan membentuk sudut 90 derajat, lalu dorong kembali ke atas.",
                "https://www.youtube.com/shorts/rBK0XxGfwHY",
                false,
                false)
            exercisesList.add(Dips)

            val InvertedRows = Exercise4Model(4,
                "Inverted Rows",
                R.drawable.invertedrowsbagianatas,
                "a.Posisi awal : Berbaring telentang di bawah meja yang kokoh atau bar horizontal. Pegang bar dan letakkan kaki di depan Anda.\n" +
                        "b.Teknik : Tarik tubuh Anda ke atas dengan menggunakan otot punggung dan bahu. Kembalikan tubuh ke posisi awal.",
                "https://www.youtube.com/shorts/x7zlGd-bIU0",
                false,
                false)
            exercisesList.add(InvertedRows)

            val PikePushUp = Exercise4Model(5,
                "Pike Push Up",
                R.drawable.pikepushupbagianatas,
                "a.Posisi awal : Mulai dalam posisi push-up dengan pinggul diangkat sehingga tubuh membentuk bentuk V.\n" +
                        "b.Teknik : Tekuk siku untuk menurunkan kepala ke lantai, lalu dorong kembali ke atas.",
                "https://www.youtube.com/shorts/jk5j7tr9pzs",
                false,
                false)
            exercisesList.add(PikePushUp)

            val DiamondPushUp = Exercise4Model(6,
                "Diamond Push Up",
                R.drawable.diamondpushupbagianatas,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                "https://www.youtube.com/shorts/Wa5fmSxI3UI",
                false,
                false)
            exercisesList.add(DiamondPushUp)

            val SupermanHolds = Exercise4Model(7,
                "Superman Holds",
                R.drawable.supermanbagianatas,
                "a.Posisi awal : Berbaring telentang dengan tangan dan kaki menggantung bebas.\n" +
                        "b.Teknik : Angkat dada dan kaki Anda dari lantai sejauh mungkin, tahan posisi ini selama beberapa detik.",
                "https://www.youtube.com/shorts/KTWWh3GsyYw",
                false,
                false)
            exercisesList.add(SupermanHolds)

            val DolphinPushUp = Exercise4Model(8,
                "Dolphin Push Up",
                R.drawable.dolphinbagianatas,
                "Plank adalah latihan di mana Anda berbaring telentang dengan berat tubuh ditopang oleh lengan yang ditekuk, dengan siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dan Anda harus menjaga inti tubuh terasa tegang. ",
                "https://www.youtube.com/watch?v=49Ane4PIRP8&pp=ygUadmlkZW8gY2FyYSBEb2xwaGluIFB1c2ggVXA%3D",
                false,
                false)
            exercisesList.add(DolphinPushUp)

            val BicepCurls = Exercise4Model(9,
                "Bicep Curls",
                R.drawable.bicepbagiaatas,
                "a.Posisi awal : Berdiri tegak dengan dumbbell di kedua tangan, lengan menggantung di sisi tubuh.\n" +
                        "b.Teknik : Tekuk lengan untuk mengangkat dumbbell ke arah bahu, lalu turunkan kembali dengan ",
                "https://www.youtube.com/shorts/KxLHJyRaTL8",
                false,
                false)
            exercisesList.add(BicepCurls)

            val TricepsDips = Exercise4Model(10,
                "Triceps Dips",
                R.drawable.tricepsbagianatas,
                "a.Posisi awal : Letakkan tangan di belakang tubuh pada kursi atau bangku kokoh, kaki ditekuk dan kaki lurus di depan Anda.\n" +
                        "b.Teknik : Turunkan tubuh dengan menekuk siku hingga lengan membentuk sudut 90 derajat, lalu dorong kembali ke atas.\n",
                "https://www.youtube.com/shorts/IHfgaD9SiWU",
                false,
                false)
            exercisesList.add(TricepsDips)
            return exercisesList
        }
    }
}