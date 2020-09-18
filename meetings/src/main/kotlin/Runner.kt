package com.rsk

import java.nio.file.Paths

fun main() {

    val postCode = USZipCode("")

    val logger: Logger = FileLogger(Paths.get("/some/file.log"))

    val meeting = Meeting("Review", UkAddress("a", "b", "c", UKPostCode("")), logger)
    val review = PersonalReview(
        "Review Meeting",
        Participant(Name("Alice"),
            "alice@gmail"),
        listOf(),
        Room("Room 1"),
        logger
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