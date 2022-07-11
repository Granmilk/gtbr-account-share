package com.gtbr.gtbraccountshare.handler;

import com.gtbr.gtbraccountshare.service.AccountShareService;
import com.gtbr.gtbraccountshare.service.RequestService;
import com.gtbr.gtbraccountshare.service.ThumbnailsService;
import com.gtbr.gtbraccountshare.utils.SpringUtils;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.entities.sticker.StickerItem;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.LayoutComponent;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.requests.restaction.AuditableRestAction;
import net.dv8tion.jda.api.requests.restaction.MessageAction;
import net.dv8tion.jda.api.requests.restaction.pagination.ReactionPaginationAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.annotation.meta.When;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Formatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CommandHandlerTest {

    private final CommandHandler commandHandler;
    private final AccountShareService accountShareService;
    private final RequestService requestService;
    private final ThumbnailsService thumbnailsService;

    private SpringUtils springUtils;

    public CommandHandlerTest() {
        this.accountShareService = Mockito.mock(AccountShareService.class);
        this.requestService = Mockito.mock(RequestService.class);
        this.thumbnailsService = Mockito.mock(ThumbnailsService.class);
        this.springUtils = mock(SpringUtils.class);


        when(springUtils.getBean(AccountShareService.class)).thenReturn(this.accountShareService);
        when(springUtils.getBean(RequestService.class)).thenReturn(this.requestService);
        when(springUtils.getBean(ThumbnailsService.class)).thenReturn(this.thumbnailsService);

        this.commandHandler = new CommandHandler();
    }

    @Test
    void shareHandleTest(){
        commandHandler.handle(new MessageReceivedEvent(null, 1l, new Message() {
            @Nullable
            @Override
            public MessageReference getMessageReference() {
                return null;
            }

            @NotNull
            @Override
            public Mentions getMentions() {
                return null;
            }

            @Override
            public boolean isEdited() {
                return false;
            }

            @Nullable
            @Override
            public OffsetDateTime getTimeEdited() {
                return null;
            }

            @NotNull
            @Override
            public User getAuthor() {
                return null;
            }

            @Nullable
            @Override
            public Member getMember() {
                return null;
            }

            @NotNull
            @Override
            public String getJumpUrl() {
                return null;
            }

            @NotNull
            @Override
            public String getContentDisplay() {
                return null;
            }

            @NotNull
            @Override
            public String getContentRaw() {
                return "?share teste teste teste true";
            }

            @NotNull
            @Override
            public String getContentStripped() {
                return null;
            }

            @NotNull
            @Override
            public List<String> getInvites() {
                return null;
            }

            @Nullable
            @Override
            public String getNonce() {
                return null;
            }

            @Override
            public boolean isFromType(@NotNull ChannelType channelType) {
                return false;
            }

            @NotNull
            @Override
            public ChannelType getChannelType() {
                return null;
            }

            @Override
            public boolean isWebhookMessage() {
                return false;
            }

            @NotNull
            @Override
            public MessageChannel getChannel() {
                return null;
            }

            @NotNull
            @Override
            public GuildMessageChannel getGuildChannel() {
                return null;
            }

            @NotNull
            @Override
            public PrivateChannel getPrivateChannel() {
                return null;
            }

            @NotNull
            @Override
            public TextChannel getTextChannel() {
                return null;
            }

            @NotNull
            @Override
            public NewsChannel getNewsChannel() {
                return null;
            }

            @Nullable
            @Override
            public Category getCategory() {
                return null;
            }

            @NotNull
            @Override
            public Guild getGuild() {
                return null;
            }

            @NotNull
            @Override
            public List<Attachment> getAttachments() {
                return null;
            }

            @NotNull
            @Override
            public List<MessageEmbed> getEmbeds() {
                return null;
            }

            @NotNull
            @Override
            public List<ActionRow> getActionRows() {
                return null;
            }

            @NotNull
            @Override
            public List<MessageReaction> getReactions() {
                return null;
            }

            @NotNull
            @Override
            public List<StickerItem> getStickers() {
                return null;
            }

            @Override
            public boolean isTTS() {
                return false;
            }

            @Nullable
            @Override
            public MessageActivity getActivity() {
                return null;
            }

            @NotNull
            @Override
            public MessageAction editMessage(@NotNull CharSequence charSequence) {
                return null;
            }

            @NotNull
            @Override
            public MessageAction editMessageEmbeds(@NotNull Collection<? extends MessageEmbed> collection) {
                return null;
            }

            @NotNull
            @Override
            public MessageAction editMessageComponents(@NotNull Collection<? extends LayoutComponent> collection) {
                return null;
            }

            @NotNull
            @Override
            public MessageAction editMessageFormat(@NotNull String s, @NotNull Object... objects) {
                return null;
            }

            @NotNull
            @Override
            public MessageAction editMessage(@NotNull Message message) {
                return null;
            }

            @NotNull
            @Override
            public AuditableRestAction<Void> delete() {
                return null;
            }

            @NotNull
            @Override
            public JDA getJDA() {
                return null;
            }

            @Override
            public boolean isPinned() {
                return false;
            }

            @NotNull
            @Override
            public RestAction<Void> pin() {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Void> unpin() {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Void> addReaction(@NotNull Emoji emoji) {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Void> clearReactions() {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Void> clearReactions(@NotNull Emoji emoji) {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Void> removeReaction(@NotNull Emoji emoji) {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Void> removeReaction(@NotNull Emoji emoji, @NotNull User user) {
                return null;
            }

            @NotNull
            @Override
            public ReactionPaginationAction retrieveReactionUsers(@NotNull Emoji emoji) {
                return null;
            }

            @Nullable
            @Override
            public MessageReaction getReaction(@NotNull Emoji emoji) {
                return null;
            }

            @NotNull
            @Override
            public AuditableRestAction<Void> suppressEmbeds(boolean b) {
                return null;
            }

            @NotNull
            @Override
            public RestAction<Message> crosspost() {
                return null;
            }

            @Override
            public boolean isSuppressedEmbeds() {
                return false;
            }

            @NotNull
            @Override
            public EnumSet<MessageFlag> getFlags() {
                return null;
            }

            @Override
            public long getFlagsRaw() {
                return 0;
            }

            @Override
            public boolean isEphemeral() {
                return false;
            }

            @Nullable
            @Override
            public ThreadChannel getStartedThread() {
                return null;
            }

            @NotNull
            @Override
            public MessageType getType() {
                return null;
            }

            @Nullable
            @Override
            public Interaction getInteraction() {
                return null;
            }

            @Override
            public RestAction<ThreadChannel> createThreadChannel(String s) {
                return null;
            }

            @Override
            public void formatTo(Formatter formatter, int flags, int width, int precision) {

            }

            @Override
            public long getIdLong() {
                return 0;
            }
        }));
    }

}