package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise5Model

class Exercises5 {

    companion object{
        fun defaultExerciseList():ArrayList<Exercise5Model>{
            var exercisesList = ArrayList<Exercise5Model>()

            val PushUp = Exercise5Model(1,
                "Push Up",
                R.drawable.pushupbagianatas,
                "a. Posisi awal : Telungkup di lantai dengan tangan ditempatkan sedikit lebih lebar dari bahu dan kaki lurus, jari-jari menghadap ke depan.\n" +
                        "b. Teknik : Tekan tangan Anda ke lantai untuk mengangkat tubuh, pastikan tubuh lurus dari kepala hingga kaki. Turunkan tubuh dengan ",
                "https://youtu.be/fMKBfvsltAQ?si=iqO_QMWST1dW6cTM",
                false,
                false)
            exercisesList.add(PushUp)

            val PullUp = Exercise5Model(2,
                "Pull Up",
                R.drawable.pullupbagianatas,
                "a. Posisi awal : Pegang palang pull-up dengan tangan lebar atau sesuai variasi yang Anda pilih. Kaki menggantung bebas.\n" +
                        "b. Teknik : Tarik tubuh Anda naik dengan menggunakan otot lengan dan punggung. Turunkan tubuh dengan kendalikan gerakan. ",
                "https://www.youtube.com/shorts/HD3m9qPHguY",
                false,
                false)
            exercisesList.add(PullUp)

            val Dips = Exercise5Model(3,
                "Dips",
                R.drawable.dipsbagianatas,
                "a.Posisi awal : Pegang dua kursi atau bangku kokoh dengan tangan di sisi badan. Kaki ditekuk dan kaki lurus di depan Anda.\n" +
                        "b. Teknik : Turunkan tubuh dengan menekuk siku hingga lengan membentuk sudut 90 derajat, lalu dorong kembali ke atas.",
                "https://www.youtube.com/shorts/rBK0XxGfwHY",
                false,
                false)
            exercisesList.add(Dips)

            val InvertedRows = Exercise5Model(4,
                "Inverted Rows",
                R.drawable.invertedrowsbagianatas,
                "a.Posisi awal : Berbaring telentang di bawah meja yang kokoh atau bar horizontal. Pegang bar dan letakkan kaki di depan Anda.\n" +
                        "b.Teknik : Tarik tubuh Anda ke atas dengan menggunakan otot punggung dan bahu. Kembalikan tubuh ke posisi awal.",
                "https://www.youtube.com/shorts/x7zlGd-bIU0",
                false,
                false)
            exercisesList.add(InvertedRows)

            val PikePushUp = Exercise5Model(5,
                "Pike Push Up",
                R.drawable.pikepushupbagianatas,
                "a.Posisi awal : Mulai dalam posisi push-up dengan pinggul diangkat sehingga tubuh membentuk bentuk V.\n" +
                        "b.Teknik : Tekuk siku untuk menurunkan kepala ke lantai, lalu dorong kembali ke atas.",
                "https://www.youtube.com/shorts/jk5j7tr9pzs",
                false,
                false)
            exercisesList.add(PikePushUp)

            val DiamondPushUp = Exercise5Model(6,
                "Diamond Push Up",
                R.drawable.diamondpushupbagianatas,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                "https://www.youtube.com/shorts/Wa5fmSxI3UI",
                false,
                false)
            exercisesList.add(DiamondPushUp)

            val SupermanHolds = Exercise5Model(7,
                "Superman Holds",
                R.drawable.supermanbagianatas,
                "a.Posisi awal : Berbaring telentang dengan tangan dan kaki menggantung bebas.\n" +
                        "b.Teknik : Angkat dada dan kaki Anda dari lantai sejauh mungkin, tahan posisi ini selama beberapa detik.",
                "https://www.youtube.com/shorts/KTWWh3GsyYw",
                false,
                false)
            exercisesList.add(SupermanHolds)
            return exercisesList
        }
    }
}