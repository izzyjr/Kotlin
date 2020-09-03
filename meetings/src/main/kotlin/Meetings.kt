package com.rsk

open class Meeting(val meetingName: String, val location: Location = Location("")) {

    private val logger = Logger()

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

class PersonalReview(meetingName: String, val employee: Participant, reviewers: List<Participant>, location: Location = Location(""))
    : Meeting(meetingName, location) {

}