package com.github.konradr25.knsgconference.conference

import org.springframework.data.repository.CrudRepository

interface ConferenceRepository : CrudRepository<Conference, Long>
