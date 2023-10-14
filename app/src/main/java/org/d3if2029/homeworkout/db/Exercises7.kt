package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise7Model


class Exercises7 {

    companion object{
        fun defaultExerciseList():ArrayList<Exercise7Model>{
            var exercisesList = ArrayList<Exercise7Model>()

            val Squat = Exercise7Model(1,
                "Squat",
                R.drawable.squat,
                "Squat adalah latihan yang melibatkan menekuk lutut dan pinggul, mirip seperti bergerak untuk duduk di kursi. Ini menguatkan kaki, paha, dan bokong Anda.",
                false,
                false)
            exercisesList.add(Squat)

            val wallSit = Exercise7Model(2,
                "Wall Sit",
                R.drawable.wall_sit,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                false,
                false)
            exercisesList.add(wallSit)

            val Lunges = Exercise7Model(3,
                "Lunges",
                R.drawable.lunge,
                "Lunges adalah latihan yang melibatkan langkah besar ke depan dengan satu kaki dan menekuk lutut hingga sudut 90 derajat, lalu kembali ke posisi berdiri. Ini melatih kaki, paha, dan bokong serta keseimbangan.",
                false,
                false)
            exercisesList.add(Lunges)

            val GluteBridge = Exercise7Model(4,
                "Glute Bridge",
                R.drawable.clutebridge,
                "Glute Bridge adalah latihan di mana Anda angkat pinggul dari lantai dengan fokus pada otot gluteus (bokong) Anda.",
                false,
                false)
            exercisesList.add(GluteBridge)

            val stepUp = Exercise7Model(5,
                "Step-Up Onto Chair",
                R.drawable.stepup,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                false,
                false)
            exercisesList.add(stepUp)

            val DonkeyKicks = Exercise7Model(6,
                "Donkey Kicks",
                R.drawable.donkeykicks,
                "Donkey Kicks adalah latihan di mana Anda mengangkat kaki ke belakang sejauh mungkin dari posisi berlutut, fokus pada otot gluteus (bokong).",
                false,
                false)
            exercisesList.add(DonkeyKicks)

            val BoxJumps = Exercise7Model(7,
                "Box Jumps",
                R.drawable.boxjumps,
                "Box Jumps adalah latihan lompatan ke atas kotak atau bangku untuk mengembangkan kekuatan kaki dan daya ledak.",
                false,
                false)
            exercisesList.add(BoxJumps)

            val SquatJumps = Exercise7Model(8,
                "Squat Jumps",
                R.drawable.squatjumps,
                "Squat Jumps adalah squat biasa dengan penambahan lompatan untuk melibatkan otot kaki, paha, dan bokong, serta memberikan unsur kardiovaskular. ",
                false,
                false)
            exercisesList.add(SquatJumps)

            val CalfRaises = Exercise7Model(9,
                "Calf Raises",
                R.drawable.high_knees,
                "Calf Raises adalah latihan di mana Anda mengangkat tumit sejauh mungkin untuk menguatkan otot betis (bagian belakang kaki).",
                false,
                false)
            exercisesList.add(CalfRaises)

            val BicycleCrunches = Exercise7Model(10,
                "Bicycle Crunches",
                R.drawable.biyclecrunch,
                "Bicycle Crunches adalah latihan perut di mana Anda membawa lutut ke siku secara bergantian saat berbaring telentang. ",
                false,
                false)
            exercisesList.add(BicycleCrunches)

            val MountainClimbers = Exercise7Model(11,
                "Mountain Climbers",
                R.drawable.mountaiclimber,
                "Mountain Climbers adalah latihan yang melibatkan membawa lutut ke dada secara bergantian dalam posisi push-up untuk melatih otot perut dan kaki.",
                false,
                false)
            exercisesList.add(MountainClimbers)

            val Burpees = Exercise7Model(12,
                "Burpees",
                R.drawable.burpes,
                "Burpees adalah latihan yang melibatkan squat, push-up, dan lompatan, melibatkan seluruh tubuh dan memberikan elemen kardiovaskular dalam satu gerakan.",
                false,
                false)
            exercisesList.add(Burpees)

            return exercisesList
        }
    }
}