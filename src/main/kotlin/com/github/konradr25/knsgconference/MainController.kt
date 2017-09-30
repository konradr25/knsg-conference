package com.github.konradr25.knsgconference

import com.github.konradr25.knsgconference.conference.Conference
import com.github.konradr25.knsgconference.conference.ConferenceRepository
import com.github.konradr25.knsgconference.member.Member
import com.github.konradr25.knsgconference.member.MemberRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException
import java.util.*

@RestController
class MainController (private val conferenceRepository: ConferenceRepository,
                      private val memberRepository: MemberRepository) {

    @GetMapping("/conference/all")
    fun findAllConferences() = conferenceRepository.findAll().map(Conference::name)

    @GetMapping("/conference/id/{id}")
    fun findConferenceById(@PathVariable id:Long)
            = conferenceRepository.findById(id)

    @GetMapping("/conference/{id}/members")
    fun findMembersByConference(@PathVariable conferenceId:Long): Iterable<Member> {
        val conferenceById: Optional<Conference> = conferenceRepository.findById(conferenceId)
        val conference: Conference = conferenceById.orElseThrow {RuntimeException("Conference not found")}
        return memberRepository.findByConferenceId(conference.id)
    }
}