package com.github.konradr25.knsgconference

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class FileEntity(val fileName: String,
             @Id @GeneratedValue(strategy = GenerationType.AUTO)
             val id: Long = -1)