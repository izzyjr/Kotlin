package com.rsk

import java.nio.file.Paths

open class Meeting(val meetingName: String, open val location: Location, val logger: Logger) {

    open val locationName = ""

    fun addParticipants(participant: Participant) {
        logger.info("Participant added")
        if (verifyParticipants(participant)) {
            println("Added: ${participant.participantName}")
        }
    }

    private fun verifyParticipants(participant: Participant): Boolean {
        println("Try to verify")
        return true
    }

    protected open fun verifyMeeting() {
        println("Meeting: verify meeting")
    }
}

class PersonalReview(meetingName: String, val employee: Participant, reviewers: List<Participant>, override val location: Room, logger: Logger)
    : Meeting(meetingName, location, logger) {

    override val locationName: String
        get() = location.roomName

    fun closeReview() {
        println("review ended")
        verifyMeeting()
    }

    override fun verifyMeeting() {
        println("PersonalReview: verify meeting")
        super.verifyMeeting()
    }

}