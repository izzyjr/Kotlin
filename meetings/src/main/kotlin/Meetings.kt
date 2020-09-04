package com.rsk

open class Meeting(val meetingName: String, val location: Location = Location()) {

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

    protected open fun verifyMeeting() {
        println("Meeting: verify meeting")
    }
}

class PersonalReview(meetingName: String, val employee: Participant, reviewers: List<Participant>, location: Location = Location())
    : Meeting(meetingName, location) {

    fun closeReview() {
        println("review ended")
        verifyMeeting()
    }

    override fun verifyMeeting() {
        println("PersonalReview: verify meeting")
        super.verifyMeeting()
    }

}