package com.github.konradr25.knsgconference.member

import com.github.konradr25.knsgconference.FileEntity
import com.github.konradr25.knsgconference.conference.Conference
import javax.persistence.*

@Entity
class Member(val firstName: String,
             val lastName: String,
             val topic: String,
             @ManyToOne
             val fileEntity: FileEntity,
             @ManyToOne
             val conference: Conference,
             @Id @GeneratedValue(strategy = GenerationType.AUTO)
             val id: Long = -1)