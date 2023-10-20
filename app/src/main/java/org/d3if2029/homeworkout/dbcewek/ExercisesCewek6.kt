package org.d3if2029.homeworkout.dbcewek

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entitycewek.ExerciseModelCewek6


class ExercisesCewek6 {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModelCewek6>{
            var exercisesList = ArrayList<ExerciseModelCewek6>()

            val PushUp = ExerciseModelCewek6(1,
                "Push Up",
                R.drawable.pushupcewek,
                "a. Posisi awal : Telungkup di lantai dengan tangan ditempatkan sedikit lebih lebar dari bahu dan kaki lurus atau ditekuk.\n" +
                        " b. Teknik : Tekan tangan Anda ke lantai untuk mengangkat tubuh, pastikan tubuh lurus dari kepala ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(PushUp)

            val TricepsDips = ExerciseModelCewek6(2,
                "Triceps Dips",
                R.drawable.tricepsdipscewek,
                "a.Posisi awal : Gunakan bangku atau kursi yang kokoh. Letakkan tangan di belakang tubuh pada kursi.\n" +
                        " b.Teknik : Turunkan tubuh dengan menekuk siku hingga lengan membentuk sudut 90 derajat, lalu dorong",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(TricepsDips)

            val Plank = ExerciseModelCewek6(3,
                "Plank",
                R.drawable.plankcewek,
                "a. Posisi awal : Berpegangan pada lengan bawah dan jari kaki, tubuh dalam posisi lurus dari kepala hingga kaki.\n" +
                        "b. Teknik : Pertahankan posisi plank selama beberapa detik atau lebih lama sesuai kemampuan Anda.",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(Plank)

            val SupermanHolds = ExerciseModelCewek6(4,
                "Superman Holds",
                R.drawable.supermancewek,
                "a. Posisi awal : Berbaring tengkurap dengan tangan dan kaki menggantung bebas.\n" +
                        " b. Teknik : Angkat dada dan kaki Anda dari lantai sejauh mungkin, tahan posisi ini selama beberapa ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(SupermanHolds)

            val BicepCurls = ExerciseModelCewek6(5,
                "Bicep Curls",
                R.drawable.bicepcurlcewek,
                "a. Posisi awal : Berdiri tegak dengan dumbbell di kedua tangan, lengan menggantung di sisi tubuh.\n" +
                        "b. Teknik : Tekuk lengan untuk mengangkat dumbbell ke arah bahu, lalu turunkan kembali dengan  ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(BicepCurls)


            return exercisesList
        }
    }
}