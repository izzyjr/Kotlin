package com.rsk

import java.lang.IllegalArgumentException

class Meeting {

    private val logger = Logger()
    val meetingName: String = ""

    fun addParticipants(participant: Participant) {
        if (verifyParticipants(participant)) {
            println("Added: ${participant.participantName}")
        }
    }

    private fun verifyParticipants(participant: Participant): Boolean {
        println("Try to verify")
        return true
    }

    protected fun verifyMeeting() {

    }

}