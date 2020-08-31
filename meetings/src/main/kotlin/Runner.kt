package com.rsk

fun main() {

    val meeting = Meeting()
    println("Created: $meeting")

    val participant = Participant()
    val name = Name()
    name.name = "Kevin"
    participant.name = name
    participant.email = "kevin@gmail.com"

    val canonicalEmail: String = participant.canonicalEmail
    println(canonicalEmail)
    println(participant.email)

    meeting.addParticipants(participant)


}