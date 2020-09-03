package com.rsk

fun main() {

    val meeting = Meeting("Review", Location("an address"))


    println("Created: $meeting with name ${meeting.meetingName} and at ${meeting.location.address}")

    val name = Name("Kevin Jones")
    val participant = Participant(name, "kevin@gmail.com")

    val canonicalEmail: String = participant.canonicalEmail
    println(canonicalEmail)
    println(participant.email)

    meeting.addParticipants(participant)


}