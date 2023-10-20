package org.d3if2029.homeworkout.dbcewek

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entitycewek.ExerciseModelCewek4


class ExercisesCewek4 {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModelCewek4>{
            var exercisesList = ArrayList<ExerciseModelCewek4>()

            val PushUp = ExerciseModelCewek4(1,
                "Push Up",
                R.drawable.pushupcewek,
                "a. Posisi awal : Telungkup di lantai dengan tangan ditempatkan sedikit lebih lebar dari bahu dan kaki lurus atau ditekuk.\n" +
                        " b. Teknik : Tekan tangan Anda ke lantai untuk mengangkat tubuh, pastikan tubuh lurus dari kepala ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(PushUp)

            val TricepsDips = ExerciseModelCewek4(2,
                "Triceps Dips",
                R.drawable.tricepsdipscewek,
                "a.Posisi awal : Gunakan bangku atau kursi yang kokoh. Letakkan tangan di belakang tubuh pada kursi.\n" +
                        " b.Teknik : Turunkan tubuh dengan menekuk siku hingga lengan membentuk sudut 90 derajat, lalu dorong",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(TricepsDips)

            val Plank = ExerciseModelCewek4(3,
                "Plank",
                R.drawable.plankcewek,
                "a. Posisi awal : Berpegangan pada lengan bawah dan jari kaki, tubuh dalam posisi lurus dari kepala hingga kaki.\n" +
                        "b. Teknik : Pertahankan posisi plank selama beberapa detik atau lebih lama sesuai kemampuan Anda.",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(Plank)

            val SupermanHolds = ExerciseModelCewek4(4,
                "Superman Holds",
                R.drawable.supermancewek,
                "a. Posisi awal : Berbaring tengkurap dengan tangan dan kaki menggantung bebas.\n" +
                        " b. Teknik : Angkat dada dan kaki Anda dari lantai sejauh mungkin, tahan posisi ini selama beberapa ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(SupermanHolds)

            val BicepCurls = ExerciseModelCewek4(5,
                "Bicep Curls",
                R.drawable.bicepcurlcewek,
                "a. Posisi awal : Berdiri tegak dengan dumbbell di kedua tangan, lengan menggantung di sisi tubuh.\n" +
                        "b. Teknik : Tekuk lengan untuk mengangkat dumbbell ke arah bahu, lalu turunkan kembali dengan  ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(BicepCurls)

            val ShoulderPress = ExerciseModelCewek4(6,
                "Shoulder Press",
                R.drawable.shouldercewek,
                "a. Posisi awal : Duduk atau berdiri dengan dumbbell di kedua tangan, siku ditekuk 90 derajat.\n" +
                        " b.Teknik : Dorong dumbbell ke atas dengan tangan lurus, lalu turunkan kembali ke posisi awal.",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(ShoulderPress)

            val SideLateralRaises = ExerciseModelCewek4(7,
                "Side Lateral Raises",
                R.drawable.sideleteralcewek,
                "a. Posisi awal : Berdiri tegak dengan dumbbell di kedua tangan, lengan menggantung di sisi tubuh.\n" +
                        " b.Teknik : Angkat lengan ke samping hingga sejajar dengan bahu, lalu turunkan kembali.",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(SideLateralRaises)

            val TricepsKickbacks = ExerciseModelCewek4(8,
                "Triceps Kickbacks",
                R.drawable.tricepkickbackscewek,
                "a. Posisi awal : Berdiri dengan satu kaki di depan, tangan memegang dumbbell di tangan yang berlawanan dengan kaki depan.\n" +
                        " b. Teknik : Tekuk tubuh pada pinggang dan dorong beban ke belakang dengan lengan lurus, lalu kembali ke posisi awal.",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(TricepsKickbacks)



            val PullUpVariasiAssistedPullUp = ExerciseModelCewek4(9,
                "PullUpVariasiAssistedPullUp",
                R.drawable.pullupcewek,
                "a. Posisi awal : Pegang palang pull-up dengan tangan lebar atau sesuai variasi yang Anda pilih. Kaki menggantung bebas.\n" +
                        " b.Teknik : Jika Anda tidak dapat melakukan pull-up penuh, gunakan alat assistensi atau band elastis untuk membantu mengurangi berat tubuh Anda. ",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(PullUpVariasiAssistedPullUp)

            val DolphinPushUp = ExerciseModelCewek4(10,
                "Dolphin Push Up",
                R.drawable.dolpinpushcewek,
                "a. Posisi awal : Mulai dalam posisi pike (pinggul diangkat) dengan tangan dan kaki sebagai penopang.\n" +
                        " b. Teknik : Tekuk lengan Anda untuk menurunkan kepala ke arah lantai dan dorong kembali ke atas seperti gerakan lumba-lumba.\n",
                "https://youtu.be/j1DJSJpsD2c?si=sCCoiNQukcwiM-sg",
                false,
                false)
            exercisesList.add(DolphinPushUp)

            return exercisesList
        }
    }
}