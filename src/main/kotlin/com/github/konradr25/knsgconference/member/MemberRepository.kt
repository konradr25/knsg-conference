package com.github.konradr25.knsgconference.member

import org.springframework.data.repository.CrudRepository

interface MemberRepository : CrudRepository<Member, Long> {

    fun findByConferenceId(id: Long): Iterable<Member>
}
