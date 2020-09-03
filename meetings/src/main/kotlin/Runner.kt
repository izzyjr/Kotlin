package com.rsk

fun main() {

    val meeting = Meeting("Review", Location("an address"))
    val review = PersonalReview(
        "Review Meeting",
        Participant(Name("Alice"),
            "alice@gmail"),
        listOf(),
        Location("Room 1")
    )

    println("Created: $review with name ${review.meetingName} at ${review.location.address}")
    review.closeReview()

    val name = Name("Kevin Jones")
    val participant = Participant(name, "kevin@gmail.com")

    val canonicalEmail: String = participant.canonicalEmail
    println(canonicalEmail)
    println(participant.email)

    meeting.addParticipants(participant)


}