package com.rsk

fun main() {

    val postCode = USZipCode("")

    val meeting = Meeting("Review", UkAddress("a", "b", "c", "d"))
    val review = PersonalReview(
        "Review Meeting",
        Participant(Name("Alice"),
            "alice@gmail"),
        listOf(),
        Room("Room 1")
    )

    println("Created: $review with name ${review.meetingName} at ${review.locationName}")
    review.closeReview()

    val name = Name("Kevin Jones")
    val participant = Participant(name, "kevin@gmail.com")

    val canonicalEmail: String = participant.canonicalEmail
    println(canonicalEmail)
    println(participant.email)

    meeting.addParticipants(participant)


}