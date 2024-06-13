package com.example.community_help_network.repository;


import com.example.community_help_network.model.HelpRequest;
import org.springframework.data.jpa.repository.JpaRepository;



public interface HelpRequestRepository extends JpaRepository<HelpRequest, Long> {
}

