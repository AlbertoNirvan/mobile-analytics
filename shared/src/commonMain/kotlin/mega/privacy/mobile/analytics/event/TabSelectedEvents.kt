package mega.privacy.mobile.analytics.event

import mega.privacy.mobile.analytics.annotations.TabSelectedEvent

@TabSelectedEvent(screenName = "ChatScreen", tabName = "Chats")
interface ChatsTab

@TabSelectedEvent(screenName = "ChatScreen", tabName = "Meetings")
interface MeetingsTab

@TabSelectedEvent(screenName = "PhotosScreen", tabName = "Timeline")
interface TimelineTab

@TabSelectedEvent(screenName = "PhotosScreen", tabName = "Albums")
interface AlbumsTab

@TabSelectedEvent(screenName = "HomeScreen", tabName = "Recents")
interface RecentsTab

@TabSelectedEvent(screenName = "HomeScreen", tabName = "Offline")
interface OfflineTab

@TabSelectedEvent(screenName = "SharedItemsScreen", tabName = "Incoming Shares")
interface IncomingSharesTab

@TabSelectedEvent(screenName = "SharedItemsScreen", tabName = "Outgoing Shares")
interface OutgoingSharesTab

@TabSelectedEvent(screenName = "SharedItemsScreen", tabName = "Link Shares")
interface LinkShares