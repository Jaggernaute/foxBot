package com.jaggernaute.foxbot;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class Say extends ListenerAdapter {
    @Override
    public void onSlashCommand(SlashCommandEvent event) {
        if (event.getName().equals("say")) {
            event.reply(Objects.requireNonNull(event.getOption("content")).getAsString()).queue(); // reply immediately
        }
    }
}
