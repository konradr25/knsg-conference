package com.github.konradr25.knsgconference.conference

import com.github.konradr25.knsgconference.FileEntity
import javax.persistence.*

@Entity
class Conference(
        val name: String,
        @OneToOne
        val logo: FileEntity,
        @OneToOne
        val schedule: FileEntity,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1)
