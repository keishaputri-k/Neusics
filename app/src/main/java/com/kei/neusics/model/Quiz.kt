package com.kei.neusics.model

data class Quiz (
    val id: Int,
    val text : String,
    val answers: List<String>,
    var isCurrent: Boolean = false
)

fun getListQuiz(): MutableList<Quiz> {
    return mutableListOf(
        Quiz(
            id = 0,
            text = "MCB that used in electric circuit to cut off the electric supply in case of short circuit works on …",
            answers = listOf(
                "Heating effect of the current",
                "Magnetic effect of the current",
                "Physical effect of the current",
                "Chemical effect of the current"
            ),
        ),
        Quiz(
            id = 1,
            text = "Which among the following is used to determine the boiling point of the liquid?",
            answers = listOf("Hypsometer", "Hygroscope", "Hygrometer", "Hydrometer")
        ),
        Quiz(
            id = 2,
            text = "Who among the following had invented the sonar?",
            answers = listOf("Lewis Nixon", "Paul Langévin", "Luigi Menabrea", "Konrad Zuse")
        ),
        Quiz(
            id = 3,
            text = "The period of swing of a simple gravity pendulum depends on …",
            answers = listOf("Length", "Mass", "Diameter", "Force")
        ),
        Quiz(
            id = 4,
            text = "The glaciers typically start melting from …",
            answers = listOf("Base", "Right side", "Left side", "Top")
        ),
        Quiz(
            id = 5,
            text = "The term ‘Dynamic lift’ is explained by …",
            answers = listOf(
                "Bernoulli’s theorem",
                "Newton’s gravitational principle",
                "Kirchhoff’s law",
                "First law of thermodynamics"
            )
        ),
        Quiz(
            id = 6,
            text = "Beaufort scale is used to measure ……",
            answers = listOf(
                "Wind force",
                "Speed and pressure of wind",
                "Cooling of air",
                "Altitude"
            )
        ),
        Quiz(
            id = 7,
            text = "The filament of an electric bulb is made up of …",
            answers = listOf("Tungsten", "Silver", "Copper", "Lead")
        ),
        Quiz(
            id = 8,
            text = "Which among the following laws determines the ‘frequency of the emitted radiation?",
            answers = listOf(
                "Wien's displacement law",
                "Stefan–Boltzmann law",
                "Planck's law",
                "Charles's law"
            )
        ),
        Quiz(
            id = 9,
            text = "The measuring unit of an angle is:",
            answers = listOf("Radian", "Lux", "Steradian", "Farad")
        )
    )
}