package com.rsk

fun main() {

    val meeting = Meeting("Review")
    println("Created: $meeting with name ${meeting.meetingName}")

    val name = Name()
    name.name = "Kevin Jones"
    val participant = Participant(name, "kevin@gmail.com")

    val canonicalEmail: String = participant.canonicalEmail
    println(canonicalEmail)
    println(participant.email)

    meeting.addParticipants(participant)


}