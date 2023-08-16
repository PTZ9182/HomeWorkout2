package org.d3if2029.homeworkout.dbcewek

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entitycewek.ExerciseModelCewek5


class ExercisesCewek5 {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModelCewek5>{
            var exercisesList = ArrayList<ExerciseModelCewek5>()

            val PushUp = ExerciseModelCewek5(1,
                "Push Up",
                R.drawable.pushupcewek,
                "a. Posisi awal : Telungkup di lantai dengan tangan ditempatkan sedikit lebih lebar dari bahu dan kaki lurus atau ditekuk.\n" +
                        " b. Teknik : Tekan tangan Anda ke lantai untuk mengangkat tubuh, pastikan tubuh lurus dari kepala ",
                false,
                false)
            exercisesList.add(PushUp)

            val TricepsDips = ExerciseModelCewek5(2,
                "Triceps Dips",
                R.drawable.tricepsdipscewek,
                "a.Posisi awal : Gunakan bangku atau kursi yang kokoh. Letakkan tangan di belakang tubuh pada kursi.\n" +
                        " b.Teknik : Turunkan tubuh dengan menekuk siku hingga lengan membentuk sudut 90 derajat, lalu dorong",
                false,
                false)
            exercisesList.add(TricepsDips)

            val Plank = ExerciseModelCewek5(3,
                "Plank",
                R.drawable.plankcewek,
                "a. Posisi awal : Berpegangan pada lengan bawah dan jari kaki, tubuh dalam posisi lurus dari kepala hingga kaki.\n" +
                        "b. Teknik : Pertahankan posisi plank selama beberapa detik atau lebih lama sesuai kemampuan Anda.",
                false,
                false)
            exercisesList.add(Plank)

            val SupermanHolds = ExerciseModelCewek5(4,
                "Superman Holds",
                R.drawable.supermancewek,
                "a. Posisi awal : Berbaring tengkurap dengan tangan dan kaki menggantung bebas.\n" +
                        " b. Teknik : Angkat dada dan kaki Anda dari lantai sejauh mungkin, tahan posisi ini selama beberapa ",
                false,
                false)
            exercisesList.add(SupermanHolds)

            val BicepCurls = ExerciseModelCewek5(5,
                "Bicep Curls",
                R.drawable.bicepcurlcewek,
                "a. Posisi awal : Berdiri tegak dengan dumbbell di kedua tangan, lengan menggantung di sisi tubuh.\n" +
                        "b. Teknik : Tekuk lengan untuk mengangkat dumbbell ke arah bahu, lalu turunkan kembali dengan  ",
                false,
                false)
            exercisesList.add(BicepCurls)

            val ShoulderPress = ExerciseModelCewek5(6,
                "Shoulder Press",
                R.drawable.shouldercewek,
                "a. Posisi awal : Duduk atau berdiri dengan dumbbell di kedua tangan, siku ditekuk 90 derajat.\n" +
                        " b.Teknik : Dorong dumbbell ke atas dengan tangan lurus, lalu turunkan kembali ke posisi awal.",
                false,
                false)
            exercisesList.add(ShoulderPress)

            val SideLateralRaises = ExerciseModelCewek5(7,
                "Side Lateral Raises",
                R.drawable.sideleteralcewek,
                "a. Posisi awal : Berdiri tegak dengan dumbbell di kedua tangan, lengan menggantung di sisi tubuh.\n" +
                        " b.Teknik : Angkat lengan ke samping hingga sejajar dengan bahu, lalu turunkan kembali.",
                false,
                false)
            exercisesList.add(SideLateralRaises)

            return exercisesList
        }
    }
}